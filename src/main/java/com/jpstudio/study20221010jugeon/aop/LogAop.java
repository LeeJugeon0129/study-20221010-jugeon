package com.jpstudio.study20221010jugeon.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.CodeSignature;
import org.springframework.stereotype.Component;

import javax.validation.constraints.Pattern;

@Component
@Aspect
@Slf4j
public class LogAop {

    @Pointcut("execution(* com.jpstudio.study20221010jugeon..*Api.*(..))")
    private void poinCut(){}

    @Pointcut("@annotation(com.jpstudio.study20221010jugeon.aop.annotation.LogAspect)")
    private void annotationPoinCut(){}

    @Around("annotationPoinCut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        CodeSignature codeSignature = (CodeSignature) joinPoint.getSignature(); // 다운캐스팅 가능
        String className = codeSignature.getDeclaringTypeName(); //클래스도 자료형이라서 typeName
        String methodName = codeSignature.getName();
        String[] parameterNames = codeSignature.getParameterNames(); //Names = String 배열 //이거 가져올려면 codesignature로 다운캐스팅 해야됨
        Object[] args = joinPoint.getArgs(); //매개변수 값 들고오기

        for(int i=0; i< parameterNames.length; i++) {
            log.info("<<<< Parameter info >>>> {}.{} >>> [{}: {}]", className, methodName, parameterNames[i], args[i]);
        }

        Object result = joinPoint.proceed();

        log.info("<<<< Retrun >>>> {}.{} >>> [{}]", className, methodName, result);

        return result;
    }
}
