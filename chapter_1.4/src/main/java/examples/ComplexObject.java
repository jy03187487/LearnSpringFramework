package examples;

import lombok.Data;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

@Data
public class ComplexObject {

    private Properties adminEmails;
    private List someList;
    private Map someMap;
    private Set someSet;
}
