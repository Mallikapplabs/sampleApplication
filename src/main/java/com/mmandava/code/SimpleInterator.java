package com.mmandava.code;

import java.util.function.Consumer;
import java.util.Arrays;
import java.util.List;

public class SimpleInterator {
    public static void main(String[] args) {

        List<Double> values = Arrays.asList(1.0,3.0,5.1,62.4,3.5,6.5);

        Consumer<Double> c = new Consumer<Double>() {
           public void accept(Double i)
           {
               System.out.println(i);
           }
        };


        values.forEach(c);
    }
}
