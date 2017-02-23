package com.atian.java8.lambdas;

import java.util.function.IntConsumer;
import java.util.stream.IntStream;

/**
 * Created by xutiantian on 2017/2/22.
 */
public class LambdaDemos {
    public static void main(String[] args) {

        IntConsumer printer = System.out::println;

        int offset = 10;

        IntStream.range(1, 10)
                .map(x -> (x + offset) * 2)
//                .filter(x -> x % 3 == 0)
                .forEach(printer);

        // offset = 15; // offset must be effectively final
    }
}
