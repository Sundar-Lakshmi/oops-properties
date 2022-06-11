package com.oops.properties.inheritance;

public class Main {
    public static void main(String[] args) {
        double length;
        double height;
        double width;
        Box b1 = new Box(2.08, 2.08, 2.08);
        System.out.println(b1.length + " " + b1.width + " " + b1.height);

        Box b2 = new Box();
        System.out.println(b2.length + " " + b2.width + " " + b2.height);

        Box b3 = new Box(b2);
        System.out.println(b3.length + " " + b3.width + " " + b3.height);

        

        //CHILD CLASS
        //default
        ChildBox b4 = new ChildBox();
        System.out.println(b4.length + " " + b4.width + " " + b4.height + " " + b4.weight);

        //super implementation
        ChildBox b5 = new ChildBox(2.08, 2.0, 2.0, 2.0);
        System.out.println(b5.length + " " + b5.width + " " + b5.height + " " + b5.weight);

        //copy constructor implementation
        ChildBox superchild = new ChildBox(b5);
        System.out.println(superchild.length + " " + superchild.width + " " + superchild.height + " " + superchild.weight);



        //MULTILEVEL INHERITANCE
        //default of Multilevel Inheritance
        BoxPrice childboxPrice = new BoxPrice();
        System.out.println("Frst output of BoxPrice obj" + childboxPrice.length + " " + childboxPrice.width + " " + childboxPrice.height + " " + childboxPrice.weight + " " + childboxPrice.cost);

        //Multilevel Inheritance - super class
        BoxPrice boxPrice1 = new BoxPrice(1.0, 1.0, 1.0, 1.0, 20);
        System.out.println("Implementation of Super Keyword in BoxPrice Class " + boxPrice1.length + " " + boxPrice1.width + " " + boxPrice1.height + " " + boxPrice1.weight + " " + boxPrice1.cost);

        //Multilevel Inheritance - Copy Constructor
        BoxPrice boxPrice2 = new BoxPrice(boxPrice1);
        System.out.println("Implementation of Copy Constructor in BoxPrice Class " + boxPrice2.length + " " + boxPrice2.width + " " + boxPrice2.height + " " + boxPrice2.weight + " " + boxPrice2.cost);




        //TRYOUT
//        Box b6 = new ChildBox(1.0, 1.0, 1.0, 1.0);
//        System.out.println(b6.length + " " + b6.width + " " + b6.height + " " + b6.weight);

//        ChildBox b6 = new Box(1.0, 2.0, 1.0);
//        System.out.println(b6.length + " " + b6.width + " " + b6.height + " " + b6.weight);

    }
}
