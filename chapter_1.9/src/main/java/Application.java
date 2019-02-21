import examples.MovieRecommender;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Application {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("annotation.xml");
        System.out.println(((ClassPathXmlApplicationContext) context).getBeanFactory());
        ((ClassPathXmlApplicationContext) context).registerShutdownHook();

        MovieRecommender movieRecommender = context.getBean("movieRecommender", MovieRecommender.class);
        System.out.println(movieRecommender);
        System.out.println(movieRecommender.getMovieCatalog());
        System.out.println(movieRecommender.getMovieCatalog2());
        System.out.println(movieRecommender.getMovieCatalog3());
        System.out.println(movieRecommender.getMovieCatalog4());
        System.out.println(movieRecommender.getMovieCatalogSet());
    }
}
