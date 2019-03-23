package com.example.demowork.aspect;

import com.example.demowork.dao.TestDao;
import com.example.demowork.moddle.User;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author psl
 * @date 2019/3/21
 */
@Component
@Aspect
public class TestAspect {
    @Autowired
    private TestDao dao ;
    @Pointcut("execution(* com.example.demowork.service.TestService.*(..) )")
    public void pc(){

    }
    @Around(value = "TestAspect.pc()")
    public Object before(ProceedingJoinPoint pjp) throws Throwable {
        Object[] args = pjp.getArgs();
        boolean flag = dao.findPermission((User) args[0]);
        if (!false){
            return "您的权限不够，抱歉";
        }else {
            return pjp.proceed();
        }
    }
}
