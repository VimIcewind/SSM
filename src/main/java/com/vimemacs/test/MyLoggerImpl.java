package com.vimemacs.test;

import java.lang.reflect.Method;

/**
 * @author HWD
 * @date 2024/6/27 16:01
 */
public class MyLoggerImpl implements MyLogger {
    @Override
    public void saveIntoMethodTime(Method method) {
        System.out.println("Into " + method.getName() + " method time is " + System.currentTimeMillis());
    }

    @Override
    public void saveOutMethodTime(Method method) {
        System.out.println("Out " + method.getName() + " method time is " + System.currentTimeMillis());
    }
}
