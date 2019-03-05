package examples;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import java.util.Calendar;
import java.util.Date;

@Data
@Component
public class Person {

    @Value("me")
    private String name;
    @Value("-1")
    private int age;

    @DateTimeFormat
    private Date date = Calendar.getInstance().getTime();

    // the usual getters and setters...
}