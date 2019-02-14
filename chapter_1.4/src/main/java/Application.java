import examples.ExampleBean;
import examples.ExampleBeanSetter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import x.y.ThingOne;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext( "bean.xml");
        ThingOne thingOne = context.getBean("beanOne", ThingOne.class);
        System.out.println(thingOne);
        System.out.println(thingOne.getThingTwo());
        System.out.println(thingOne.getThingThree());

        ExampleBean exampleBean = context.getBean("exampleBean", ExampleBean.class);
        System.out.println(exampleBean);
        System.out.println(exampleBean.getYears());
        System.out.println(exampleBean.getUltimateAnswer());

        ExampleBeanSetter exampleBeanSetter = context.getBean("exampleBeanSetter", ExampleBeanSetter.class);
        System.out.println(exampleBeanSetter.getBeanOne());
        System.out.println(exampleBeanSetter.getBeanTwo());
        System.out.println(exampleBeanSetter.getI());
    }
}
