package Polymorphism;

public class Circle extends  Shapes{

    // this will run when  object of Circle is created;
    // hence it is overriding the parent method
    @Override
    void area(){
        System.out.println("area is pie * r * r ");
    }
}
