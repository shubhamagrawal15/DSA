package Inheritance;

public class Box {
    double lenght;
    double height;
    double width;


    static void greeting(){
        System.out.println("Hey I m in a box. Greetings!");
    }


    Box(){
        this.height=-1;
        this.lenght=-1;
        this.width=-1;
    }

    // cube
    Box(double side){
       // super();  // object class
        this.width=side;
        this.lenght=side;
        this.height=side;
    }

    Box(double lenght,double height,double width){
        System.out.println("Box class constructor");
        this.lenght=lenght;
        this.height=height;
        this.width=width;
    }

    Box(Box old){
        this.height=old.height;
        this.lenght=old.lenght;
        this.width= old.width;
    }

    public void displayInformation(){
        System.out.println("RUNNING THE BOX !");
    }

}
