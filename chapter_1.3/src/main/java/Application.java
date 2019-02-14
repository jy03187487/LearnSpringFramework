import examples.ClientService;
import examples.ExampleBean;
import examples.ExampleBeanTwo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext( "bean.xml");
        ExampleBean exampleBean = context.getBean("exampleBean", ExampleBean.class);
        ExampleBeanTwo exampleBeanTwo = context.getBean("anotherExample", ExampleBeanTwo.class);
        ExampleBeanTwo exampleBeanTwoAlias = context.getBean("anotherExampleAlias", ExampleBeanTwo.class);
        ExampleBeanTwo exampleBeanTwoAlias2 = context.getBean("anotherExampleAlias2", ExampleBeanTwo.class);
        System.out.println(exampleBean.toString());
        System.out.println(exampleBeanTwo.toString());
        System.out.println(exampleBeanTwoAlias.toString());
        System.out.println(exampleBeanTwoAlias2.toString());

        ClientService clientService = context.getBean("clientService", ClientService.class);
        System.out.println(clientService.toString());
        ClientService clientService2 = context.getBean("clientServiceFromServiceLocator", ClientService.class);
        System.out.println(clientService2.toString());
    }
}
