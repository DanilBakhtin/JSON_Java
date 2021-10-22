package Main;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class ConverterJSON extends Converter{


    public ConverterJSON(String filePath) {
        super(filePath);
    }

    /**
     * Сереализация JSON
     */
    public void toJSON(Test[] test) throws IOException {
        try {
            ObjectMapper mapper = new ObjectMapper();
            //mapper.configure(SerializationFeature.WRAP_ROOT_VALUE, true);
            mapper.writeValue(new File(filePath), test);
            System.out.println("\nФайл создан!");
            //обработчик ошибок
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    /**
     * Десереализация JSON
     */
    public Test[] JSONtoJavaObject() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(new File(filePath), Test[].class);
    }

}
