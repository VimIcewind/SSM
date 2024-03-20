package com.vimemacs.demo;

/**
 * @author HWD
 * @date 2024/3/20 16:55
 */
public class LazySingleton {
    private static LazySingleton singleton = null;
    
    private LazySingleton(){
        
    }
    
    public static LazySingleton getInstance() {
        if (null == singleton) {
            singleton = new LazySingleton();
        }
        return singleton;
    }
        
}
