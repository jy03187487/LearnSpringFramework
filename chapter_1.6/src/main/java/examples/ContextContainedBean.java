package examples;

import lombok.Getter;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

@Getter
public class ContextContainedBean implements ApplicationContextAware, BeanNameAware {

    private ApplicationContext applicationContext;

    private String beanName;

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public void setBeanName(String s) {
        this.beanName = s;
    }
}
