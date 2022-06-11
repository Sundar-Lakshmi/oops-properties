package com.oops.properties.polymorphism;

public class Numbers {
    int a,b;

    String sum(String a, int b){
        return a+b;
    }

    String sum(int b, String a){
        return a+b;
    }
}
