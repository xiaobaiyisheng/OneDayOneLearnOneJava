package com.heima.basic._01_abstractClass.lianxi;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User{


    public Member() {
    }

    public Member(String username, double leftMoney) {
        super(username, leftMoney);
    }
    public void reveive(ArrayList<Integer> list){
        // 从多个红包当中抽取一个，给自己
        // 随机数集合
        int i = new Random().nextInt(list.size());

        Integer delta = list.remove(i);
        // 当前成员自己本来有多少钱
        double money = super.getLeftMoney();
        super.setLeftMoney(money+delta);

    }
}
