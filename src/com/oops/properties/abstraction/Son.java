package com.oops.properties.abstraction;

public class Son extends Parent {
    String naam;
    int age;
    public Son(String naam, int age, int exp) {
        super(exp);
        this.naam = naam;
        this.age = age;
    }


    @Override
    void career() {
        System.out.println("Son : I want to be Developer and my name is " + naam );
        System.out.println("My exp is " + exp);
    }

    @Override
    void eat() {
        System.out.println("I want to eat Rice");
    }
}
