package com.vimemacs.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.test.context.TestExecutionListeners;

/**
 * @author HWD
 * @date 2024/3/12 12:01
 */
@Service
public class SpringTest {
    @Test
    public void testSpring() {
        // 获取应用上下文
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 获取 SpringTest 类
        SpringTest springTest = (SpringTest) applicationContext.getBean("springTest");
        // 调用 sayHello 方法
        springTest.sayHello();
    }

    public void sayHello() {
        System.out.println("Hi, Spring!");
    }
}
