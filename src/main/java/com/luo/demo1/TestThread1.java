package com.luo.demo1;

//创建线程方式一：继承Thread类
public class TestThread1 extends Thread{
    @Override
    public void run() {
        //run方法，可重写
        for (int i = 0; i < 20; i++) {
            System.out.println("我在看代码" + i);
        }
    }

    public static void main(String[] args) {

        TestThread1 testThread1 = new TestThread1();
        testThread1.start();

        for (int i = 0; i < 200; i++) {
            System.out.println("我在学习多线程" + i);
        }
    }
}
