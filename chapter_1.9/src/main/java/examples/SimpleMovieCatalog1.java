package examples;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("main")
public class SimpleMovieCatalog1 implements MovieCatalog {
}
