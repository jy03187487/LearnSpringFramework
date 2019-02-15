package replace;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

public class ReplacementComputeValue implements MethodReplacer {
    public Object reimplement(Object o, Method method, Object[] args) throws Throwable {
        String s = (String)args[0];
        return s;
    }
}
