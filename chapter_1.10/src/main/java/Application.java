import examples.AppConfig;
import examples.ComponentExample;
import examples.SessionScopedService;
import examples.SessionScopedUserService;
import examples.SimpleMovieLister;
import examples.TestBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        SessionScopedService sessionScopedService = context.getBean("sessionScopedService", SessionScopedService.class);
        System.out.println(sessionScopedService);

        SessionScopedUserService sessionScopedUserService = context.getBean("sessionScopedUserService", SessionScopedUserService.class);
        System.out.println(sessionScopedUserService);

        SimpleMovieLister simpleMovieLister = context.getBean("simpleMovieLister", SimpleMovieLister.class);
        System.out.println(simpleMovieLister);

        TestBean testBean = context.getBean("publicInstance", TestBean.class);
        System.out.println(testBean);

        AppConfig appConfig = context.getBean("appConfig", AppConfig.class);
        System.out.println(appConfig);

        ComponentExample componentExample = context.getBean("componentExample", ComponentExample.class);
        System.out.println(componentExample);
    }
}
