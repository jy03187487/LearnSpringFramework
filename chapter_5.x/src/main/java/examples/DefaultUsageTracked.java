package examples;

import java.util.concurrent.atomic.AtomicInteger;

public class DefaultUsageTracked implements UsageTracked {

    private AtomicInteger atomicInteger = new AtomicInteger(0);

    public void incrementUseCount() {
        System.out.println("atomicInteger = " + atomicInteger.incrementAndGet());
    }
}
