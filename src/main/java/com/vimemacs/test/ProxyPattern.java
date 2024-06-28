package com.vimemacs.test;

/**
 * @author HWD
 * @date 2024/6/28 13:55
 */
public class ProxyPattern {
    public static void main(String[] args) {
        Proxy proxy = new Proxy(new RealSubject());
        proxy.operation();
    }
}

abstract class Subject {
    abstract void operation();
}

class RealSubject extends Subject {
    void operation() {
        System.out.println("operation ......");
    }
}

class Proxy extends Subject {
    private Subject subject;
    
    public Proxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    void operation() {
        this.preOperation();
        subject.operation();
        this.postOperation();
    }
    
    void preOperation() {
        System.out.println("pre operation......");
    }
    
    void postOperation() {
        System.out.println("post operation......");
    }
}
