package Abstraction;

 abstract public class Parent {

     int age;

     Parent(int age){
         this.age=age;
     }

     static void hello(){
         System.out.println("hello");
     }
     void normal(){
         System.out.println("this is the normal one");
     }

    abstract  void  career();
    abstract  void partner();

}
