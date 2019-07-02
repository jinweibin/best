package com.logictech.aop;

import com.alibaba.fastjson.JSON;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;

import static com.logictech.BestApplication.logger;

/**
 * @author JG.Hannibal
 * @since 2017/11/9 下午3:43
 */
@Aspect
@Component
public class ServiceAop {
    private static final String HEAD = "##########|    ";

    @Pointcut("execution(* com.logictech.service..*(..))")
    public void servicePointCut() {
    }

    /**
     * Advice that logs methods throwing exceptions.
     *
     * @param joinPoint join point for advice
     * @param e         exception
     */
    @AfterThrowing(pointcut = "servicePointCut()", throwing = "e")
    public void logAfterThrowing(JoinPoint joinPoint, Throwable e) {
        logger.error(HEAD + "发生异常 在 {}.{}() with cause = \'{}\' 异常为: \'{}\'", joinPoint.getSignature()
                        .getDeclaringTypeName(),
                joinPoint.getSignature().getName(), e.getCause() != null ? e.getCause() : "NULL", e.getMessage(), e);
    }


    @Around("servicePointCut()")
    public Object interceptor(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        if (logger.isDebugEnabled()) {
            logger.debug(HEAD + "进入: {}.{}() 参数为: {}", proceedingJoinPoint.getSignature()
                            .getDeclaringTypeName(),
                    proceedingJoinPoint.getSignature().getName(),
                    proceedingJoinPoint.getArgs().length == 1 ?
                            JSON.toJSON(proceedingJoinPoint.getArgs()) : Arrays.toString
                            (proceedingJoinPoint.getArgs()));
        }
        try {
            Object result = proceedingJoinPoint.proceed();
            if (logger.isDebugEnabled()) {
                logger.debug(HEAD + "完成: {}.{}() 结果为 = {}", proceedingJoinPoint.getSignature()
                                .getDeclaringTypeName(),
                        proceedingJoinPoint.getSignature().getName(), result);
            }
            return result;
        } catch (IllegalArgumentException e) {
            logger.error(HEAD + "参数出错: {} 在 {}.{}()", Arrays.toString(proceedingJoinPoint.getArgs()),
                    proceedingJoinPoint.getSignature().getDeclaringTypeName(), proceedingJoinPoint.getSignature().getName());

            throw e;
        }
    }

}
    