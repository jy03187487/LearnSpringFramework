package examples;

import org.springframework.stereotype.Component;

@Component
@CustomTransaction
public class MyCommitService {

    @CustomTransaction
    public void writeToDatabase(String s) {
        System.out.println(s);
        System.out.println("write data to database...");
    }
}
