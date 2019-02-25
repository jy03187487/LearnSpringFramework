package examples;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ScopedProxyMode;

@Configuration
@ComponentScan(basePackages="examples", scopedProxy = ScopedProxyMode.TARGET_CLASS)
public class AppConfig {
}
