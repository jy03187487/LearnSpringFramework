package examples;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.support.DefaultConversionService;
import org.springframework.format.support.DefaultFormattingConversionService;

@Configuration
@ComponentScan(basePackages = "examples")
public class AppConfig {

    @Bean("conversionService")
    public ConversionService conversionService() {
        ConversionService conversionService = new DefaultConversionService();
        return conversionService;
    }

//    @Bean("defaultFormattingConversionService")
//    public ConversionService defaultFormattingConversionService() {
//        return new DefaultFormattingConversionService();
//    }
}
