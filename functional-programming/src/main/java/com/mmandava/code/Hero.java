package com.mmandava.code;

public class Hero implements Actor{

    @Override
    public void Act() {
        System.out.println("I can Act");
    }

    @Override
    public void speak() {
        System.out.println("I can give dialogues");
    }

    public void comedy() {
        System.out.println(" I can make people laugh");
    }
}
