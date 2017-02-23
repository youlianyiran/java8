package com.atian.java8.lambdas;

/**
 * Created by xutiantian on 2017/2/22.
 */
public class RunnableDemo {
    public static void main(String[] args) {
        Runnable r = () -> System.out.println("hello");

        Thread t = new Thread(r);
        t.start();
    }
}
