package examples;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class AnnotationBean extends MyLifecyle {

    @PostConstruct
    public void annotationInit() {
        System.out.println("AnnotationBean PostConstruct.");
    }

    @PreDestroy
    public void annotationDestroy() {
        System.out.println("AnnotationBean PreDestroy.");
    }
}
