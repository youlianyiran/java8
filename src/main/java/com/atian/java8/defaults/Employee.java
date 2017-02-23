package com.atian.java8.defaults;

/**
 * Created by xutiantian on 2017/2/22.
 */
public interface Employee {
    String getFirst();
    String getLast();
    void doWork();

    default String getName() {
        return String.format("%s %s", getFirst(), getLast());
    }
}
