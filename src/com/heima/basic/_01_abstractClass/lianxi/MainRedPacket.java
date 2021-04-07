package com.heima.basic._01_abstractClass.lianxi;

import java.util.ArrayList;

public class MainRedPacket {
    public static void main(String[] args) {
        Manager manager = new Manager("群主",100);

        Member one = new Member("成员A",0);
        Member two = new Member("成员B",0);
        Member three = new Member("成员C",0);

        one.show();
        two.show();
        three.show();
        manager.show();

        System.out.println("=====================");

        ArrayList<Integer> redList = manager.send(10,3);

        one.reveive(redList);
        two.reveive(redList);
        three.reveive(redList);

        one.show();
        two.show();
        three.show();
        manager.show();

        System.out.println("=====================");

    }
}
