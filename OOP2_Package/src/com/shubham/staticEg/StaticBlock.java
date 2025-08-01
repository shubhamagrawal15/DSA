package com.shubham.staticEg;
// this is a demo to show initialization  of static variables
public class StaticBlock {
    static int a = 4;
    static int b ;

    // the will only run once when the first object is created ie. when the class is loaded for the first time
    static {
        System.out.println("I m in static block");
        b=a*5;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a);
        System.out.println(StaticBlock.b);

        StaticBlock.b=StaticBlock.b+3;
        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a);
        System.out.println(StaticBlock.b);

    }
}
