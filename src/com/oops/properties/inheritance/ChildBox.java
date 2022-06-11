package com.oops.properties.inheritance;

public class ChildBox extends Box {
    double weight;

    ChildBox() {
        this.weight = 3.0;
    }

    ChildBox(ChildBox child) {
        super(child);
        this.weight = 200.0;
    }

    public ChildBox(double length, double width, double height, double weight) {
        super(length, width, height);
/*        super.length = length;
        super.width = width;
        super.height = height;*/
        this.weight = 40;
    }


}
