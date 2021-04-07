package com.heima.basic._02_interface.learn;

public class Demo05Interface implements MyInterfaceA,MyInterfaceB{

    @Override
    public void methodA() {
        System.out.println("覆盖重写了A方法");
    }

    @Override
    public void methodB() {
        System.out.println("覆盖重写了B方法");

    }
}
