package examples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println(((AnnotationConfigApplicationContext) context).getBeanFactory());

        Example example = context.getBean("example", Example.class);
        example.execute();

        EmailService emailService = context.getBean("emailService", EmailService.class);
        emailService.sendEmail("xi'an", "content");

        System.out.println(example.getResourceLoader());
        System.out.println(example.getResourceLoader().getResource("exceptions.properties").getFile());
    }
}
