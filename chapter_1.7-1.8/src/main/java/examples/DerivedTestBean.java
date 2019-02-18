package examples;

import lombok.Data;

@Data
public class DerivedTestBean {

    private String name;
    private int age;

    public void initialize() {

    }

    @Override
    public String toString() {
        return String.format("name=%s, age=%d", name, age);
    }
}
