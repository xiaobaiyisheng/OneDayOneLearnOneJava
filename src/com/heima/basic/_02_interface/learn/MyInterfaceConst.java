package com.heima.basic._02_interface.learn;

/*
    接口当中定义承员变量，必须使用关键字修饰 public static final（可以省略）
    从效果上看，这其实就是接口的【常量】

    注意事项：
    一旦使用final关键字进行修饰，说明不可改变。
    接口当中的常量必须赋值
    接口中常量名称，使用大写字母，下环线连接
 */
public interface MyInterfaceConst {

    // 这其实是个常量，一旦赋值，不可修改
    public static int NUM = 10;


}
