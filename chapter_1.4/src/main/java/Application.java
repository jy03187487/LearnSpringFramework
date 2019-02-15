import autowire.AutowireBeanOne;
import examples.ComplexObject;
import examples.DependBean;
import examples.ExampleBean;
import examples.ExampleBeanSetter;
import fiona.apple.CommandManager;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import replace.MyValueCalculator;
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

        ComplexObject moreComplexObject = context.getBean("moreComplexObject", ComplexObject.class);
        System.out.println(moreComplexObject);
        System.out.println(moreComplexObject.getAdminEmails());
        System.out.println(moreComplexObject.getSomeList());
        System.out.println(moreComplexObject.getSomeMap());
        System.out.println(moreComplexObject.getSomeSet());

        ComplexObject moreComplexObjectMerge = context.getBean("child", ComplexObject.class);
        System.out.println(moreComplexObjectMerge.getAdminEmails());

        DependBean dependBean = context.getBean("dependBean", DependBean.class);
        System.out.println(dependBean);

        AutowireBeanOne autowireBeanOne = context.getBean("autowireBeanOne", AutowireBeanOne.class);
        System.out.println(autowireBeanOne);

        CommandManager commandManager = context.getBean("commandManager", CommandManager.class);
        System.out.println(commandManager.process(null));
        System.out.println(commandManager.process(null));

        MyValueCalculator myValueCalculator = context.getBean("myValueCalculator", MyValueCalculator.class);
        System.out.println(myValueCalculator.computeValue("111"));
    }
}
