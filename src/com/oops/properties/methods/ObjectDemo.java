package com.oops.properties.methods;

public class ObjectDemo {
    int num;
    String str;

    public ObjectDemo(int num, String str) {
        this.num = num;
        this.str = str;
    }

    public ObjectDemo() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    //toString gives you the String representation
    @Override
    public String toString() {
        return super.toString();
    }

    //finalize method gets called, when the garbage collector is called.
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public static void main(String[] args){

        ObjectDemo objectDemo = new ObjectDemo(34,"Str");
        System.out.println(objectDemo.hashCode());

    }
}
