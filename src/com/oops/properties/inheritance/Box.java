package com.oops.properties.inheritance;

public class Box {
    double length;
    double width;
    double height;

    Box(double length, double width, double height){
        this.length = length;
        this.width = width;
        this.height = height;
    }

    Box(){
        this.length = 2;
        this.width = 2;
        this.height = 2;
    }

    Box(Box box){
        this.length = box.length;
        this.width = box.width;
        this.height = box.height;
    }
}
