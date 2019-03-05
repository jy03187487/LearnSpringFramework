package examples;

import lombok.Data;

@Data
public class ExoticType {

    private String name;

    public ExoticType(String name) {
        this.name = name;
    }
}