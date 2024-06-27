package com.vimemacs.proxy;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author HWD
 * @date 2024/6/27 16:41
 */
@Aspect
@Component
public class LogInterceptor {
    @Before(value = "execution(* com.vimemacs.controller.*.*(..))")
    public void before() {
        System.out.println("Into method time: " + System.currentTimeMillis());
    }

    @After(value = "execution(* com.vimemacs.controller.*.*(..))")
    public void after() {
        System.out.println("Out method time: " + System.currentTimeMillis());
    }
}
