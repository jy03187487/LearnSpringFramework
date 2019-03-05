package examples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println(context.getResource("app.properties"));

        ResourceBean resourceBean = context.getBean("resourceBean", ResourceBean.class);
        System.out.println(resourceBean.getResource());
        System.out.println(resourceBean.getResource1());
    }
}
