package Main;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator;

import java.io.File;
import java.io.IOException;

public class ConvertorXML extends Converter{


    public ConvertorXML(String filePath) {
        super(filePath);
    }

    /**
     * Сериализация XML
     */
    public  void toXML(Patient[] patient) throws IOException {
        try {
            XmlMapper mapper = new XmlMapper();
            mapper.configure(ToXmlGenerator.Feature.WRITE_XML_DECLARATION, true);
            mapper.writeValue(new File(filePath), patient);
            System.out.println("\nФайл создан!");
            //обработчик ошибок
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    /**
     * Десереализация xml
     */
    public Patient[] XMLtoJavaObject() throws IOException {
        XmlMapper mapper = new XmlMapper();
        return mapper.readValue(new File(filePath), Patient[].class);
    }

}
