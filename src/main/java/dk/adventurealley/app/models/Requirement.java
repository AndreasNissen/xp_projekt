package dk.adventurealley.app.models;

public class Requirement {
    private String name;
    private String value;

    public Requirement(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public Requirement() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
