package com.oops.properties.polymorphism;

public class Main extends Shapes {
    public static void main(String[] args) {
        Circle c = new Circle();
        Shapes shape = new Shapes();
        Shapes circle = new Circle();
        circle.area();
    }

}
