package examples;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class BlackListNotifier {

    private String notificationAddress;

    public void setNotificationAddress(String notificationAddress) {
        this.notificationAddress = notificationAddress;
    }

    @EventListener
    public ListUpdateEvent processBlackListEvent(BlackListEvent event) {
        // notify appropriate parties via notificationAddress...
        System.out.println("got BlackListEvent " + event.toString());
        return new ListUpdateEvent();
    }

    @EventListener
    public void processListUpdateEvent(ListUpdateEvent listUpdateEvent) {
        System.out.println("got ListUpdateEvent " + listUpdateEvent.toString());
    }
}
