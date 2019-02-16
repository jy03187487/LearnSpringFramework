package examples;

import org.springframework.context.SmartLifecycle;

public abstract class MySmartLifecycle extends MyLifecyle implements SmartLifecycle {

    public boolean isAutoStartup() {
        return false;
    }
}
