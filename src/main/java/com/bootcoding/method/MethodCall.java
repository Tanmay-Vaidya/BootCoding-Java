package com.bootcoding.method;

public class MethodCall {
    public void method1(){
        System.out.println("This is call method 1");
    }
    public void method2(){
        System.out.println("This is call method2");
    }
    public static void main(String[] args) {
        System.out.println("This is main method");
        MethodCall m=new MethodCall();
        m.method1();
        m.method2();

    }
}
