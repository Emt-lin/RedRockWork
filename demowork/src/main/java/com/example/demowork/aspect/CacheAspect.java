package com.example.demowork.aspect;

import com.example.demowork.annotion.Cache;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.*;

/**
 * @author psl
 * @date 2019/3/22
 */
@Component
@Aspect
public class CacheAspect {
    private Map<String,Object> cacheMap =  new HashMap<>();
    private Map<Long,String> time = new HashMap<>();

    @Pointcut("@annotation(com.example.demowork.annotion.Cache)")
    public void pc(){

    }
    @Around("CacheAspect.pc()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable{
        MethodSignature signature = (MethodSignature) pjp.getSignature();
        Method method = signature.getMethod();
        Cache cache = method.getDeclaredAnnotation(Cache.class);
        if (cache != null){
            String key = method.getName()+"_"+ Arrays.toString(pjp.getArgs()) ;
            Object value = cacheMap.get(key);
            if (value != null){
                return value;
            }
        }
        Object proceed = pjp.proceed();
        if (cache != null){
            String key = method.getName()+"_"+ Arrays.toString(pjp.getArgs()) ;
            cacheMap.put(key,proceed);
            time.put(System.currentTimeMillis(),key);
        }
        return proceed;
    }
    @AfterReturning
    @Before("CacheAspect.pc()")
    public void removeCache(){
        long end = System.currentTimeMillis();
        for (long start:time.keySet()
             ) {
            if ((end - start) == 1000*60*30){
                String key = time.get(start);
                cacheMap.remove(key);
            }
        }
    }
}
