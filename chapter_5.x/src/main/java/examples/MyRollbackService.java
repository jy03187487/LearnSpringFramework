package examples;

import org.springframework.stereotype.Component;

@Component
@CustomTransaction
public class MyRollbackService {
    @CustomTransaction
    public void writeToDatabase() {
        System.out.println("write data to database...");
        throw new RuntimeException("unknown exception happened!");
    }
}
