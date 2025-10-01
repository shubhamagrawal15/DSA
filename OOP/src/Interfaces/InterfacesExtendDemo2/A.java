package Interfaces.InterfacesExtendDemo2;

public interface A {
    // stattic interface methods should have always  a body
    // called vua the interface name in psvm as static methods dont need an object to run; A.greeting()

    static  void greeting(){
        System.out.println("Hey I am a static method");
    };
   default void fun(){
       System.out.println("I am in A");
   };
}
