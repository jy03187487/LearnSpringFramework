package examples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println(((AnnotationConfigApplicationContext) context).getBeanFactory());

        DependsOnExoticType dependsOnExoticType = context.getBean("dependsOnExoticType", DependsOnExoticType.class);
        System.out.println(dependsOnExoticType.getType());
//        System.out.println(dependsOnExoticType.getConversionService());

        System.out.println(context.getBean("person", Person.class));
    }
}
