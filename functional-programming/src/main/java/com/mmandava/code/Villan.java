package com.mmandava.code;

public class Villan implements Actor {
    @Override
    public void Act() {
        System.out.println("I can Act in even i am Villan");
    }

    @Override
    public void speak() {
        System.out.println("I can Speak even i am villan");
    }
}
