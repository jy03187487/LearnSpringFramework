package examples;

import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

@Component
public class MyClassService {

    @NonNull
    private String s;

    public void doSomething() {
        System.out.println("my class service done.");
    }
}
