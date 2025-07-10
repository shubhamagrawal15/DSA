package Inheritance;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        /*
        Box box1 = new Box(4,2,9);
        Box box2= new Box(box1);
        System.out.println(box1.lenght);
        System.out.println(box1.width);
        System.out.println(box1.height);

        System.out.println(box2.lenght);
        System.out.println(box2.width);
        System.out.println(box2.height);

         */


        /*
        BoxWeight box3 = new BoxWeight();
        System.out.println(box3.weight);
        System.out.println(box3.lenght);

        BoxWeight box4 = new BoxWeight(4,5,6,15);


         */


        /*

        Box box5 = new BoxWeight(2,3,4,8);
        System.out.println(box5.weight); // cannnot access properties of class Boxweight
        // the type of the refernce variable {box5 type Box}  and not the type of object will determine what members can be accessed
        // but if we do the opposite

        // There are many variable in both parent nad  child classes
        // we are given to access to variables that re in ref type i.e. in this e.g. BoxWeight
        // hence we should have access to weight variable
        // this also means,that the ones we are trying to access should be initialized
        // but here when the object itself is of type parent class how will you call the contructor of child class
        // this is why error


        BoxWeight box6 = new Box();  //


         */


//        BoxPrice box = new BoxPrice(5,8,200);
//        System.out.println(box.lenght);


        Box box1 = new Box(4,2,9);

//        box1.greeting();
          Box.greeting();

        Box boxweight = new BoxWeight();
        boxweight.greeting();   // no overrding



        BoxWeight newBox = new BoxWeight();
        newBox.greeting();





    }
}
