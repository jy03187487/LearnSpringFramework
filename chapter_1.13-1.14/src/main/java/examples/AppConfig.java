package examples;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableLoadTimeWeaving;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:app.properties")
//@EnableLoadTimeWeaving
public class AppConfig {

    @Bean
    @Production
    public DataSource productDataSource() {
        return new ProductDataSource();
    }

    @Bean
    @Profile("dev")
    public DataSource devDataSource() {
        return new DevDataSource();
    }

    @Bean
    @Profile("default")
    public DataSource defaultDataSource() {
        return new DefaultDataSource();
    }
}
