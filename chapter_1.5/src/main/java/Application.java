import examples.PrototypeBean;
import examples.SingletonBean;
import examples.ThreadBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.SimpleThreadScope;

public class Application {
    public static void main(String[] args) {
        final ApplicationContext context = new ClassPathXmlApplicationContext( "scope.xml");
        ((ClassPathXmlApplicationContext) context).getBeanFactory().registerScope("thread", new SimpleThreadScope());

        SingletonBean singletonBean = context.getBean("singletonBean", SingletonBean.class);
        System.out.println(singletonBean);
        SingletonBean singletonBean2 = context.getBean("singletonBean", SingletonBean.class);
        System.out.println(singletonBean2);

        PrototypeBean prototypeBean1 = context.getBean("prototypeBean", PrototypeBean.class);
        System.out.println(prototypeBean1);
        PrototypeBean prototypeBean2 = context.getBean("prototypeBean", PrototypeBean.class);
        System.out.println(prototypeBean2);

        ThreadBean threadBean = context.getBean("threadBean", ThreadBean.class);
        System.out.println(threadBean);
        ThreadBean threadBean2 = context.getBean("threadBean", ThreadBean.class);
        System.out.println(threadBean2);
        new Thread(new Runnable() {
            public void run() {
                System.out.println(context.getBean("threadBean", ThreadBean.class));
            }
        }).start();

    }
}
