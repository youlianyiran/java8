package com.atian.java8.lambdas;

/**
 * Created by xutiantian on 2017/2/22.
 */
@FunctionalInterface
interface PersonFactory<P extends Person> {
    P create(String firstName, String lastName);
}
