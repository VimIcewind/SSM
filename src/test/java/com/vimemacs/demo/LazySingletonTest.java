package com.vimemacs.demo;

import org.junit.Test;

/**
 * @author HWD
 * @date 2024/3/20 16:58
 */
public class LazySingletonTest {
    @Test
    public void testGetInstance() {
        LazySingleton singleton = LazySingleton.getInstance();
        System.out.println(singleton);
    }
}