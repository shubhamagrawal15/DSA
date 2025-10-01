package Interfaces.InterfacesExtendDemo2;

public interface B {
    void greet();
    default void fun2(){
        System.out.println("I am in A");
    };
   public void fun();
}
