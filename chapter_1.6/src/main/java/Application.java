import examples.AnnotationBean;
import examples.ContextContainedBean;
import examples.InterfaceBean;
import examples.XmlBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        final ApplicationContext context =
                new ClassPathXmlApplicationContext( "lifecycle.xml", "bean_aware.xml");
        ((ClassPathXmlApplicationContext) context).registerShutdownHook();
        ((ClassPathXmlApplicationContext) context).start();
//        ((ClassPathXmlApplicationContext) context).refresh();
        //((ClassPathXmlApplicationContext) context).stop();
//        ((ClassPathXmlApplicationContext) context).close();
//        context.getBean("annotationBean", AnnotationBean.class);
//        context.getBean("interfaceBean", InterfaceBean.class);
//        context.getBean("xmlBean", XmlBean.class);
        ContextContainedBean contextContainedBean = context.getBean("contextContainedBean", ContextContainedBean.class);
        System.out.println("applicationContext:" + contextContainedBean.getApplicationContext());
        System.out.println("beanName:" + contextContainedBean.getBeanName());
    }
}
