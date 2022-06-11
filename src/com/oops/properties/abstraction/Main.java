package com.oops.properties.abstraction;

public class Main {
    public static void main(String[] args){
        Son s1 = new Son("SK", 21, 4);
        s1.career();
        s1.eat();

        Parent daughter = new Daughter("Sundu", 25, 3);
        daughter.career();
        daughter.eat();

/*
        Normal normal = new Normal(2);
        normal.print();
*/
    }
}
