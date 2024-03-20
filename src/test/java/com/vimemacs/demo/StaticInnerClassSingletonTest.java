package com.vimemacs.demo;

import junit.framework.TestCase;

/**
 * @author HWD
 * @date 2024/3/20 17:29
 */
public class StaticInnerClassSingletonTest extends TestCase {

    public void testGetInstance() {
        StaticInnerClassSingleton singleton = StaticInnerClassSingleton.getInstance();
        System.out.println(singleton);
    }
}