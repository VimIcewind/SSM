package com.vimemacs.test;

import java.lang.reflect.Method;

/**
 * @author HWD
 * @date 2024/6/27 16:00
 */
public interface MyLogger {
    void saveIntoMethodTime(Method method);
    
    void saveOutMethodTime(Method method);
}
