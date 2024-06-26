package com.vimemacs.demo.factory.simple;

/**
 * @author HWD
 * @date 2024/6/26 16:31
 */
public class SimpleFactoryPattern {
    public static void main(String[] args) {
        Vehicle vehicle = Factory.produce("car");
        vehicle.run();
    }
}

class Factory {
    public static Vehicle produce(String type) {
        Vehicle vehicle = null;
        if (type.equals("car")) {
            vehicle = new Car();
            return vehicle;
        }
        if (type.equals("bus")) {
            vehicle = new Bus();
            return vehicle;
        }
        if (type.equals("bicycle")) {
            vehicle = new Bicycle();
            return vehicle;
        }
        return vehicle;
    }
}

interface Vehicle {
    void run();
}

class Car implements Vehicle {
    @Override
    public void run() {
        System.out.println("car run...");
    }
}

class Bus implements Vehicle {
    @Override
    public void run() {
        System.out.println("bus run...");
    }
}

class Bicycle implements Vehicle {
    @Override
    public void run() {
        System.out.println("bicycle run...");
    }
}