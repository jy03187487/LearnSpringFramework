import examples.AnnotationBean;
import examples.InterfaceBean;
import examples.XmlBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        final ApplicationContext context =
                new ClassPathXmlApplicationContext( "lifecycle.xml");
        ((ClassPathXmlApplicationContext) context).registerShutdownHook();
        ((ClassPathXmlApplicationContext) context).start();
//        ((ClassPathXmlApplicationContext) context).refresh();
        //((ClassPathXmlApplicationContext) context).stop();
//        ((ClassPathXmlApplicationContext) context).close();
//        context.getBean("annotationBean", AnnotationBean.class);
//        context.getBean("interfaceBean", InterfaceBean.class);
//        context.getBean("xmlBean", XmlBean.class);
    }
}
