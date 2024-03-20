package com.vimemacs.demo;

/**
 * @author HWD
 * @date 2024/3/20 15:20
 */
public class HungrySingleton {
    // step 1. 构造函数私有化
    private HungrySingleton() {
        
    }
    
    // step 2. 自行提供实例
    private static final HungrySingleton singleton = new HungrySingleton();
    
    // step 3. 提供外界可以获得该实例的方法
    public static HungrySingleton getInstance() {
        return singleton;
    }
}
