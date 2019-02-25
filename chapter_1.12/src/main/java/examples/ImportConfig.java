package examples;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ImportConfig {

    @Bean
    public ImportObject importObject() {
        return new ImportObject();
    }
}
