package com.atian.java8.lambdas;

/**
 * Created by xutiantian on 2017/2/22.
 */
public class LambdaScope {
    static int outerStaticNum;
    int outerNum;

    void testScopes() {
        Converter<Integer, String> stringConverter1 = (from) -> {
            outerNum = 23;
            return String.valueOf(from);
        };
        stringConverter1.convert(12);

        Converter<Integer, String> stringConverter2 = (from) -> {
            outerStaticNum = 72;
            return String.valueOf(from);
        };
    }

    public static void main(String[] args) {
        // Accessing local variables
        int num = 1;
        Converter<Integer, String> stringConverter =
                (from) -> String.valueOf(from + num);
        System.out.println(stringConverter.convert(2));     // 3


        // Accessing fields and static variables
        LambdaScope lambdaScope = new LambdaScope();
        lambdaScope.testScopes();
        System.out.println(lambdaScope.outerNum);

    }
}
