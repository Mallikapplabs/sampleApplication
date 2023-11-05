package com.mmandava.code;

public interface Actor {

    void Act();
    void speak();

    default void comedy(){
        System.out.println("I can make people laugh - Interface definition");
    }
}
