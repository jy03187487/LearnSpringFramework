import examples.AppConfig;
import examples.BeanOne;
import examples.BeanTwo;
import examples.CommandManager;
import examples.MyService;
import examples.TransferService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println(((AnnotationConfigApplicationContext) context).getBeanFactory());
        context.getBean("myService", MyService.class).doStuff();

        TransferService transferService = context.getBean("transferService", TransferService.class);
        System.out.println(transferService);

        System.out.println(context.getBean("beanTwo", BeanTwo.class));
        System.out.println(context.getBean("beanOne", BeanOne.class).getBeanTwo());

        System.out.println(context.getBean(
                "commandManager", CommandManager.class).process(
                        context.getBean("beanTwo", BeanTwo.class)));
    }
}
