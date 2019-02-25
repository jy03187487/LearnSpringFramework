package examples;

import lombok.Data;

@Data
public class TestBean {

    private TestBean spouse;
    private int age;
    private String name;
    private String country;

    public TestBean(String name) {
        this.name = name;
        this.age = Integer.MAX_VALUE;
    }

    public TestBean(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
