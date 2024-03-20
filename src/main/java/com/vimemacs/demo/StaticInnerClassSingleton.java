package com.vimemacs.demo;

/**
 * @author HWD
 * @date 2024/3/20 17:25
 */
public class StaticInnerClassSingleton {
    // 1. 私有化构造方法
    private StaticInnerClassSingleton() {
        
    }
    
    // 2. 私有的静态内部类，类加载器负责加锁
    private static class SingletonHolder {
        private static StaticInnerClassSingleton singleton = new StaticInnerClassSingleton();
    }

    // 3. 对外提供实例
    public static StaticInnerClassSingleton getInstance() {
        return SingletonHolder.singleton;
    }
}
