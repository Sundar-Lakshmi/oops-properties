package com.oops.properties.inheritance;

public class BoxPrice extends ChildBox{
    int cost;

    BoxPrice(){
        this.cost = 20;
    }
    BoxPrice(BoxPrice childBoxPrice){
        super(childBoxPrice);
        this.cost = 400;
    }

    public BoxPrice(double length, double width, double height, double weight, int cost) {
        super(length, width, height, weight);
        this.cost = 140;
    }
}

