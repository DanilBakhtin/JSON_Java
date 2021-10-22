package Main;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

@XmlRootElement
public class Patient {

    @JsonProperty("id")
    private long id;

    @JsonProperty("surname")
    private String surname;

    @JsonProperty("name")
    private String name;

    @JsonProperty("patronymic")
    private String patronymic;

    @JsonProperty("birthday")
    private String birthday;

    @JsonProperty("policynumber")
    private String policynumber;

    /**
     * Тесты пациента
     */
    private ArrayList<Test> tests = new ArrayList<>();

    public Patient(){

    }

    public Patient(long id, String surname, String name, String patronymic, String birthday, String policynumber) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.birthday = birthday;
        this.policynumber = policynumber;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setPolicynumber(String policynumber) {
        this.policynumber = policynumber;
    }

    public void addTests(Test test) {
        tests.add(test);
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Пациент:\n" +
                "id = " + id + "\n" +
                "Фамилия: " + surname + "\n" +
                "Имя: " + name + "\n" +
                "Отчество: " + patronymic + "\n" +
                "Дата рождения: " + birthday + "\n" +
                "Номер полиса: " + policynumber + "\n" +
                "Тесты:\n" + tests.toString();
    }
}
