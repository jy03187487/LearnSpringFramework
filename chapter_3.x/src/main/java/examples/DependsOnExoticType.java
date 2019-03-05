package examples;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Component;

@Data
@Component
public class DependsOnExoticType {

    @Value("aNameForExoticType")
    private ExoticType type;

//    @Autowired
//    private ConversionService ConversionService;

    public void setType(ExoticType type) {
        this.type = type;
    }
}