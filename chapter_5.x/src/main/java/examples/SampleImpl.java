package examples;

import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class SampleImpl implements Sample<String> {

    public void sampleGenericMethod(String param) {
        System.out.println("sampleGenericMethod executed.");
    }

    public void sampleGenericCollectionMethod(Collection<String> param) {
        System.out.println("sampleGenericCollectionMethod executed.");
    }
}
