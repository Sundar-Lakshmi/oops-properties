package com.oops.properties.abstraction;

abstract public class Parent {
    int exp;
    final int VALUE;

    public Parent(int exp) {
        this.exp = exp;
        this.VALUE =34;
    }

    abstract void career();

    abstract void eat();
}
