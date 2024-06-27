package com.vimemacs.test;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author HWD
 * @date 2024/6/27 16:04
 */
public class MyLoggerHandler implements InvocationHandler {
    private Object objOriginal;
    
    private MyLogger myLogger = new MyLoggerImpl();
    
    public MyLoggerHandler(Object obj) {
        super();
        this.objOriginal = obj;
    }
    
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        myLogger.saveIntoMethodTime(method);
        result = method.invoke(this.objOriginal, args);
        myLogger.saveOutMethodTime(method);
        return result;
    }
}
