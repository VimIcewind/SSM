package com.vimemacs.test;

import java.lang.reflect.Proxy;

/**
 * @author HWD
 * @date 2024/6/27 16:09
 */
public class MyLoggerTest {
    public static void main(String[] args) {
        BusinessClassService businessClassService = new BusinessClassServiceImpl();
        MyLoggerHandler myLoggerHandler = new MyLoggerHandler(businessClassService);
        BusinessClassService businessClass = (BusinessClassService) Proxy.newProxyInstance(businessClassService.getClass().getClassLoader(), businessClassService.getClass().getInterfaces(), myLoggerHandler);
        businessClass.doSomeThing();
    }
}
