package org.scoula.aop;

import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Log4j2
@Component
public class LogAdvice {

    @Around("execution(* org.scoula.service.MessageService.*(..))")
    public Object logTime(ProceedingJoinPoint pjp){
        long start = System.currentTimeMillis();

        Object result = null;
        try {
            result = pjp.proceed();
        }catch (Throwable e){
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();

        log.info("Time: "+(end - start));

        return result;
    }

    @Before("execution(* org.scoula.service.MessageService.sendMessage(String))&&args(content)")
    public void logBeforeWithParam(String content){
        log.info("송금 메시지: "+content);
    }


}
