package com.oops.properties.generics;

import java.util.Arrays;

public class CustomArrayList {
    private int[] data;
    private int size = 0;
    private static int DEFAULT_SIZE = 10;

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        int[] temp = new int[data.length * 2];

        // copy the current items in the new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }


    private boolean isFull() {
        return size == data.length;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {


        CustomArrayList List = new CustomArrayList();
 /*       System.out.println("Enter an array");
        Scanner sc = new Scanner(System.in);*/
        for (int i = 0; i < 14; i++) {
            List.add(2 * i);
        }

        System.out.println(List);

        /*
        ArrayList<Integer> arrayList = new ArrayList<>(10);

        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);

        System.out.println(arrayList);
*/
    }
}
