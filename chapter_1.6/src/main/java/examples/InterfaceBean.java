package examples;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class InterfaceBean extends MySmartLifecycle implements InitializingBean, DisposableBean {

    public void destroy() throws Exception {
        System.out.println("InterfaceBean destroy.");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("InterfaceBean Initializing.");
    }

    public int getPhase() {
        return 1;
    }
}
