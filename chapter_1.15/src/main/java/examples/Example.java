package examples;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

@Component
@Data
public class Example {

    @Autowired
    private MessageSource messages;

    @Autowired
    private ResourceLoader resourceLoader;

    public void execute() {
        String message = this.messages.getMessage("argument.required",
                new Object [] {"userDao"}, "Required", null);
        System.out.println(message);
    }
}