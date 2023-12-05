package tn.esprit.spring.AOP;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class FoyerAspect {
    //Methode: Advice
    @After("execution(* tn.esprit.spring.Services.*.*(..))")
    public void methode(JoinPoint jp){
        log.info("by by "+jp.getSignature().getName());
    }

    @Around("execution(* tn.esprit.spring.Services..*.*(..))")
    public Object profil(ProceedingJoinPoint pjp) throws Throwable
    {
        long start=System.currentTimeMillis();
        Object obj = pjp.proceed(); //execution
        long elapsedTime=System.currentTimeMillis()-start;
        log.info("methode execution time :" + elapsedTime+ " milliseconds.");
        return null;
    }
}
