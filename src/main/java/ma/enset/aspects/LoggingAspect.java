package ma.enset.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.logging.Logger;

@Component
@Aspect
@EnableAspectJAutoProxy
public class LoggingAspect {
    Logger logger=Logger.getLogger(LoggingAspect.class.getName());
    @Around(value ="@annotation(ma.enset.aspects.Log)")
    public Object log(ProceedingJoinPoint joinPoint) {
        Object result=null;
        Date d1 = new Date();
        logger.info("Before ...." + d1);
        try {
            result = joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        Date d2 = new Date();
        logger.info("After .... " + d2);
        logger.info("Execution Duration : "+(d2.getTime()-d1.getTime()));
        return result;
    }
}
