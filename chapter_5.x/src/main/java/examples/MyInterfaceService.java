package examples;

import org.springframework.stereotype.Component;

@Component
public class MyInterfaceService implements ServiceInterface {

    @Auditable
    public void doSomething() {
        System.out.println("my interface service done.");
    }
}
