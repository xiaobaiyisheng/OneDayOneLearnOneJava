package com.heima.basic._02_interface.learn;

/*
 从Java8开始，接口里允许定义默认方法
 格式：
 public default 返回值类型 方法名称(参数列表) {
    方法体
 }
 */
public interface MyInterfaceDefault {

    // 抽象方法
    public abstract void methodAbs();

    public default void methDefault(){
        System.out.println("这是新添加的默认方法");
    }
}
