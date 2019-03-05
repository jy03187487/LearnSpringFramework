package examples;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

@Data
@Component
public class ResourceBean {

    @Autowired
    private ResourceLoader resourceLoader;

    @Autowired
    private Environment environment;

    @Autowired
    @Value("classpath:app.properties")
    private Resource resource;

    @Autowired
    @Value("file:///app.properties")
    private Resource resource1;
}
