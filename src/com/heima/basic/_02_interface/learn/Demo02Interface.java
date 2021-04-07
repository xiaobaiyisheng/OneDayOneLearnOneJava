package com.heima.basic._02_interface.learn;

public class Demo02Interface {
    public static void main(String[] args) {
        // 创建实现类对象
        MyInterfaceDefaultA a = new MyInterfaceDefaultA();
        a.methodAbs();
        a.methDefault();
        System.out.println("==============");

        MyInterfaceDefaultB b = new MyInterfaceDefaultB();
        b.methodAbs();
        b.methDefault();
    }

}
