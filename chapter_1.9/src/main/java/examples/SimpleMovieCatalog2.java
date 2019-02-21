package examples;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("action")
public class SimpleMovieCatalog2 implements MovieCatalog {
}
