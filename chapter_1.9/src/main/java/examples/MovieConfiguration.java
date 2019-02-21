package examples;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MovieConfiguration {

    @Bean
    @Primary
    @Qualifier("action")
    public MovieCatalog firstMovieCatalog() {
        return new MovieCatalog() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        };
    }

    @Bean
    @Qualifier("action")
    public MovieCatalog secondMovieCatalog() {
        return new MovieCatalog() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        };
    }

    @Bean
    @Qualifier("action")
    public MovieCatalog qualiferMovieCatalog() {
        return new MovieCatalog() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        };
    }

    // ...
}