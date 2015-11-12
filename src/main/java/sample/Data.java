package sample;

import java.util.ArrayList;
import java.util.List;

public class Data {

    private String text;
    private Person person;

    public Data() {
        text = "";
        person = new Person();
    }

    public List<Person> allPersons() {
        List<Person> result = new ArrayList<Person>();
        result.add(new Person( "1", "Hans"));
        result.add(new Person( "2", "Franz"));
        result.add(new Person( "3", "Erwin"));
        return result;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("{\"data\": {");
        sb.append("\"text\" : \"").append(text).append("\" }");
        sb.append("\"person\" : \"").append(person).append("\" }");
        sb.append("}");
        return sb.toString();
    }
}
