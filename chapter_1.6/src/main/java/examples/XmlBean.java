package examples;

public class XmlBean extends MySmartLifecycle {

    public void init() {
        System.out.println("XmlBean init.");
    }

    public void cleanup() {
        System.out.println("XmlBean cleanup.");
    }

    public int getPhase() {
        return -1;
    }
}
