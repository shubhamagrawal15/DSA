package com.shubham.staticEg;

public class Main {
    public static void main(String[] args) {
        Human shubham = new Human(21,"shubham",0,false);
        Human rahul = new Human(22,"rahul",10000,true);
        Human arpit = new Human(22,"arpit",10000,true);


        // whenver defining or declaring or using stattic variables use class name instead of this keyword or ref variable

        System.out.println(Human.population);
        System.out.println(Human.population);
        System.out.println(Human.population);

       Main funn = new Main();
       funn.fun2();
    }


    // we know that something which is not static , belongs to an object
    void greeting(){
        System.out.println("Hello world");
    }
    // this is not dependent on objects
    static void fun(){
//        greeting()  // we cant use this because it requires an instance but the function we are using it in doesnt depend on object/instances
        // what we can do is
        // we cant access not static stuff without referencing their isntances in a static context
        // hence here i m referencing it
        Main obj = new Main();
        obj.greeting();
    }

    void fun2(){
        greeting();
    }
}
