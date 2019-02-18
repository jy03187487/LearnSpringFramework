import examples.BasicDataSource;
import examples.DependencyBean;
import examples.DerivedTestBean;
import examples.IAmInterface;
import examples.OverrideBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {
        final ApplicationContext context =
                new ClassPathXmlApplicationContext( "inherit.xml", "bean_post.xml");

        DerivedTestBean derivedTestBean1 = context.getBean("inheritsWithDifferentClass", DerivedTestBean.class);
        System.out.println(derivedTestBean1);

        DerivedTestBean derivedTestBean2 = context.getBean("inheritsWithClass", DerivedTestBean.class);
        System.out.println(derivedTestBean2);

        BasicDataSource dataSource = context.getBean("dataSource", BasicDataSource.class);
        System.out.println(dataSource);

        IAmInterface iAmInterface = context.getBean("iAmInterface", IAmInterface.class);
        System.out.println(iAmInterface);

        System.out.println(context.getBean("dependencyBean", DependencyBean.class));
        OverrideBean overrideBean = context.getBean("overrideBean", OverrideBean.class);
        System.out.println(overrideBean);

        System.out.println(((ClassPathXmlApplicationContext) context).getBeanFactory());
    }
}
