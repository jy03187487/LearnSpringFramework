package examples;

import org.springframework.context.Lifecycle;

public class MyLifecyle implements Lifecycle {

    private boolean isRunning = false;

    public void start() {
        System.out.println(this.getClass().toString() + " start.");
        isRunning = true;
    }

    public void stop() {
        System.out.println(this.getClass().toString() + " stop.");
        isRunning = false;
    }

    public boolean isRunning() {
        return isRunning;
    }
}
