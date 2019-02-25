package examples;

import lombok.Data;

@Data
public class BeanOne {

    private BeanTwo beanTwo;

    public BeanOne(BeanTwo beanTwo) {
        this.beanTwo = beanTwo;
    }
}
