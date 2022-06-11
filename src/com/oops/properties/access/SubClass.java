package com.oops.properties.access;

public class SubClass extends A{

    public SubClass(int a, String b) {
        super(a, b);
    }

    public static void main(String[] args){
        SubClass subClass = new SubClass(5, "Sundart");
        int n = subClass.num;
        System.out.println(n);
    }


}
