package Main;

import java.io.IOException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        try {


            ConvertorXML convertorXML = new ConvertorXML("patients.xml");

            //Конвертация данных из xml файла
            Patient[] patient = convertorXML.XMLtoJavaObject();

            ConverterJSON converterJSON = new ConverterJSON("tests.json");

            //Конвертация данных из json файла
            Test[] test = converterJSON.JSONtoJavaObject();

            for (int i = 0; i < patient.length; i++)
                for (int j = 0; j < test.length; j++)
                    if (test[j].getPatient() == patient[i].getId())
                        patient[i].addTests(test[j]);

            //Вывод в консоль
            for (int i = 0; i < patient.length; i++)
                System.out.println(patient[i]+"\n\n");

            //обработчик ошибок
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

    }

}
