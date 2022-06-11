package com.oops.properties.inheritance;

import com.oops.properties.access.A;

public class SubClass extends A {

    public SubClass(int a, String b) {
        super(a, b);
    }

    public static void main(String[] args){
        SubClass subClass = new SubClass(5, "Sundart");
/*
        A a = new A(5, "Sundart");
        int n = a.num;
*/
    }


}
