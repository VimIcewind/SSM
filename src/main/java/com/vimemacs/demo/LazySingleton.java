package com.vimemacs.demo;

/**
 * @author HWD
 * @date 2024/3/20 16:55
 */
public class LazySingleton {
    private static volatile LazySingleton singleton = null;
    
    private LazySingleton(){
        
    }
    
    public static LazySingleton getInstance() {
        if (null == singleton) {
            synchronized (LazySingleton.class) {
                if (null == singleton) {
                    // 创建对象，非原子操作
                    singleton = new LazySingleton();
                }
            }
        }
        return singleton;
    }
        
}
