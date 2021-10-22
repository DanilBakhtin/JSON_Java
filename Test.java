package Main;

import com.fasterxml.jackson.annotation.*;

@JsonRootName(value = "tests")
@JsonIgnoreProperties
public class Test {

    @JsonProperty("patient")
    private long patient;

    @JsonProperty("type")
    private String type;

    @JsonProperty("date")
    private String date;

    @JsonProperty("accuracy")
    private String accuracy;

    @JsonProperty("idlab")
    private String idlab;

    @JsonProperty("result")
    private String result;

    public Test(){
    }

    public Test(long patient, String type, String date, String accuracy, String idlab, String result) {
        this.patient = patient;
        this.type = type;
        this.date = date;
        this.accuracy = accuracy;
        this.idlab = idlab;
        this.result = result;
    }

    public void setPatient(long patient) {
        this.patient = patient;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setAccuracy(String accuracy) {
        this.accuracy = accuracy;
    }

    public void setIdlab(String idlab) {
        this.idlab = idlab;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public long getPatient() {
        return patient;
    }

    @Override
    public String toString() {
        return "Тип: " + type  + "\t" +
                "Дата: " + date  + "\t" +
                "Точность: " + accuracy  + "\t" +
                "Лаборатория: " + idlab  + "\t" +
                "Результат: " + result + "\n";
    }
}

