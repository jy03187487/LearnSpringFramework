package examples;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Component
public class EmailService {

    private List<String> blackList;
    @Autowired
    private ApplicationEventPublisher publisher;

    public void sendEmail(String address, String content) {
//        if (blackList.contains(address)) {
//            publisher.publishEvent(new BlackListEvent(this, address, content));
//            return;
//        }
        publisher.publishEvent(new BlackListEvent(this, address, content));
        // send email...
    }
}
