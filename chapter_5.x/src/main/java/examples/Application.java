package examples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.Collection;

public class Application {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println(((AnnotationConfigApplicationContext) context).getBeanFactory());

        MyClassService myClassService = context.getBean("myClassService", MyClassService.class);
        myClassService.doSomething();
        MyInterfaceService myInterfaceService = context.getBean("myInterfaceService", MyInterfaceService.class);
        myInterfaceService.doSomething();

        Sample sample = context.getBean("sampleImpl", SampleImpl.class);
        sample.sampleGenericMethod("Hello world! sampleGenericMethod!");
        Collection<String> collection = new ArrayList<String>();
        ((ArrayList<String>) collection).add("Hello world!");
        ((ArrayList<String>) collection).add("sampleGenericCollectionMethod!");
        sample.sampleGenericCollectionMethod(collection);

        MyCommitService myCommitService = context.getBean("myCommitService", MyCommitService.class);
        myCommitService.writeToDatabase("hello world!");

        MyRollbackService myRollbackService = context.getBean("myRollbackService", MyRollbackService.class);
        myRollbackService.writeToDatabase();
    }
}
