package com.heima.basic._01_abstractClass.lianxi;


public class User {
    private String username;
    private double leftMoney;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public double getLeftMoney() {
        return leftMoney;
    }

    public void setLeftMoney(double leftMoney) {
        this.leftMoney = leftMoney;
    }

    public User() {
    }

    public User(String username, double leftMoney) {
        this.username = username;
        this.leftMoney = leftMoney;
    }

    public void show(){
        System.out.println("用户名："+ username + "余额为："+ leftMoney+"元" );
    }
}
