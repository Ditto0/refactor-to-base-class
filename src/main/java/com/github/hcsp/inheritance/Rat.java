package com.github.hcsp.inheritance;

public class Rat extends Animal{
//    private String name;

    public Rat(String name) {
//        this.name = name;
        super(name);
    }

//    public void sayMyName() {
//        System.out.println("我的名字是" + name);
//    }

    public void zhizhi() {
        System.out.println("吱吱" + name);
    }
}
