package com.heima.basic._02_interface.learn;

public class MyInterfaceDefaultB implements MyInterfaceDefault {

    @Override
    public void methodAbs() {
        System.out.println("实现了抽象方法：BBB");
    }

    @Override
    public void methDefault() {
        System.out.println("实现类B覆盖重写了接口的默认方法");
    }
}
