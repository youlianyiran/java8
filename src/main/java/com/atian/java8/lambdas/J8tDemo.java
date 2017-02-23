package com.atian.java8.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by xutiantian on 2017/2/22.
 */
public class J8tDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
        Collections.sort(names, (a, b) -> b.compareTo(a));


        Converter<String, Integer> converter = (from) -> Integer.valueOf(from);
        Integer converted = converter.convert("123");
        System.out.println(converted);    // 123

        PersonFactory<Person> personFactory = Person::new;
        Person person = personFactory.create("Peter", "Parker");

        System.out.println(person.firstName);
    }
}
