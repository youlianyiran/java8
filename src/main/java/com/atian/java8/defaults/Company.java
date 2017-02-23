package com.atian.java8.defaults;

/**
 * Created by xutiantian on 2017/2/22.
 */
public interface Company {

    default String getName() {
        return "Company";
    }
}
