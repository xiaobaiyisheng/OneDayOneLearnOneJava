package com.heima.basic._01_abstractClass.lianxi;

import java.util.ArrayList;

public class Manager extends User {

    public Manager(){

    }
    public Manager(String username, double leftMoney) {
        super(username, leftMoney);
    }
    // 发红包的方法
    public ArrayList<Integer> send(int totalMoney, int count){
        ArrayList<Integer> redList = new ArrayList<>();

        // 查询余额
        double leftMoney = super.getLeftMoney();

        if (totalMoney > leftMoney){
            System.out.println("余额不足");
            return redList;
        }

        // 扣钱, 重新设置余额
        super.setLeftMoney(leftMoney - totalMoney);

        // 发红包
        double avg = totalMoney / count;
        double mod = totalMoney % count;

        // 塞红包
        for (int i = 0; i < count - 1; i++) {
            redList.add((int) avg);
        }
        int last = (int) (avg+mod);
        redList.add(last);

        return redList;


    }
}
