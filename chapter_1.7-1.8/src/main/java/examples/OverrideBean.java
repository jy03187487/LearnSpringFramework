package examples;

import lombok.Data;

@Data
public class OverrideBean {
    private String name;
    private DependencyBean dependencyBean;
}
