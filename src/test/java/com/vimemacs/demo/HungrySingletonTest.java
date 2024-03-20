package com.vimemacs.demo;

import org.junit.Test;

/**
 * @author HWD
 * @date 2024/3/20 15:46
 */
public class HungrySingletonTest {
    @Test
    public void testGetInstance() {
        HungrySingleton singleton = HungrySingleton.getInstance();
        System.out.println(singleton);
    }
}
