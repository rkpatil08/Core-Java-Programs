package com.core.opps.overloading;

public class Overloading {
    public static void main(String[] args) {
        Overloading overloading = new Overloading();
        overloading.method(10);
        overloading.method("XYZ");
        overloading.method('B');
    }

    public void method(int x) {
        System.out.println("Integer version " + x);
    }

    public void method(String s) {
        System.out.println("String version " + s);
    }
}
