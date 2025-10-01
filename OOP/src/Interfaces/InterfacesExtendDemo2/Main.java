package Interfaces.InterfacesExtendDemo2;

public class Main  implements A,B {


    @Override
    public void greet() {

    }

    public static void main(String[] args) {
        A.greeting();
    }

    @Override
    public void fun() {
        B.super.fun2();
    }
}
