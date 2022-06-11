package com.oops.properties.abstraction;

public class Daughter extends Parent {
String naam;
int age;
    public Daughter(String naam, int age,int exp) {
        super(exp);
        this.naam = naam;
        this.age = age;
    }

    @Override
    void career() {
        System.out.println("Daughter : I want to be a Coder and my age is " + age + " and name is " + naam);
        System.out.println("My exp is " + exp);
    }

    @Override
    void eat() {
        System.out.println("I want to eat Dosa");
    }
}
