package com.vimemacs.demo;

import org.junit.Test;

/**
 * @author HWD
 * @date 2024/3/20 15:46
 */
public class SingletonTest {
    @Test
    public void singletonTest() {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);
    }
}
