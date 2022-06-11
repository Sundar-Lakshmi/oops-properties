package com.oops.properties.access;

import java.util.Arrays;

public class A {
    protected int num;
    String str;
    int[] arr;

    public A(int a, String b) {
        this.num= num;
        this.str = b;
        this.arr = new int[a];
    }

    public int getNum() {
        return num;
    }

    public void setNum(int a) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "A{" +
                "num=" + num +
                ", str='" + str + '\'' +
                ", arr=" + Arrays.toString(arr) +
                '}';
    }
}
