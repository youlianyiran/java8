package com.atian.java8.lambdas;

/**
 * Created by xutiantian on 2017/2/22.
 */
@FunctionalInterface
interface Converter<F, T> {
    T convert(F from);
}
