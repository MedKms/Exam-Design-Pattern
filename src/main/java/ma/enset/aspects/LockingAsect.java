package ma.enset.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class LockingAsect {
    @Before(value = "@annotation(Lock)")

    public Object Lock(ProceedingJoinPoint joinPoint) throws Throwable {
        boolean neverExecute=false;
        try {
            if(neverExecute!=false){
                return joinPoint.proceed();
            }else{
                System.out.println("Methode:"+joinPoint.getSignature().getName()+" never be execute");
            }
        } catch (Throwable throwable) {
            throw new RuntimeException(throwable);
        }

        return null;
    }
}
