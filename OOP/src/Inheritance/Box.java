package Inheritance;

public class Box {
    double l ;
    double h;
    double w;

    Box(){
        this.l=-1;
        this.h=-1;
        this.w=-1;
    }

    static  void greeting(){
        System.out.println("Hey I am in box class");
    }


    // cube
    Box(double side){
        this.l=side;
        this.w=side;
        this.h=side;
    }

    Box(double l ,double h , double w){
        this.l=l;
        this.w=w;
        this.h=h;
    }

    Box(Box old){
        this.h=old.l;
        this.w=old.w;
        this.h=old.h;
    }

    public void information(){
        System.out.println("Running the box");
    }

}
