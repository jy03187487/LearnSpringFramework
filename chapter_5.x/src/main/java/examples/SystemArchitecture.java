package examples;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.DeclareParents;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
@Aspect
public class SystemArchitecture {

    @Pointcut("execution(public * *(..))")
    public void anyPublicOperation() {}

    @Pointcut("@annotation(examples.CustomTransaction) && anyPublicOperation()")
    public void anyMethodUsingTransaction() {}

    @Around("anyMethodUsingTransaction()")
    public void commit(ProceedingJoinPoint pjp) throws Throwable {
        try {
            pjp.proceed();
            pjp.proceed(new Object[]{"hello new world!"});
            doCommit();
        } catch (Throwable throwable) {
            doRollBack();
            throw throwable;
        }
    }

    private void doCommit() {
        System.out.println("commit executed.");
    }

    private void doRollBack() {
        System.out.println("rollback executed.");
    }

    @Before("anyPublicOperation() && @annotation(auditable)")
    public void audit(Auditable auditable) {
        AuditCode code = auditable.value();
        System.out.println("AuditCode = " + code.toString());
    }

    @Before("execution(* *.Sample+.sampleGenericMethod(*)) && args(param)")
    public void beforeSampleMethod(String param) {
        System.out.println("beforeSampleMethod executed. param = " + param);
    }

    @Before("execution(* *.Sample+.sampleGenericCollectionMethod(*)) && args(param)")
    public void beforeSampleMethod(Collection<String> param) {
        // Advice implementation
        System.out.println("beforeSampleMethod executed. param = " + param.toString());
    }

    @DeclareParents(value="examples.MyClassService", defaultImpl=DefaultUsageTracked.class)
    public static UsageTracked mixin;

    @Before("execution(* examples.MyClassService..*()) && this(usageTracked)")
    public void recordUsage(UsageTracked usageTracked) {
        usageTracked.incrementUseCount();
    }
}
