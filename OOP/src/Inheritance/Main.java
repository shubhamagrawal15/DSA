package Inheritance;

public class Main {
    public static void main(String[] args) {

        /*
        Box box1 = new Box(4.6,7.9,9.9);
        Box box2= new Box(4.6,7.9,9.9);

        System.out.println(box1.l+" "+ box1.h+" "+box1.w);
        System.out.println(box2.l+" "+ box2.h+" "+box2.w);
        */

        /*
        BoxWeight box3=new BoxWeight();
        System.out.println(box3.h+" "+box3.weight);
        BoxWeight box4 = new BoxWeight(4,8,9,20);
        System.out.println(box4.h+" "+box4.l+" "+box4.w+" "+box4.weight);
        */

        Box box5= new BoxWeight(2,3,4,8);
        System.out.println(box5.w);
//        System.out.println(box5.weight);

//        BoxWeight box6 = new Box();


        BoxPrice box6 = new BoxPrice();


        Box box1= new Box(4.6,7.9,9.9);
        Box.greeting();




    }

}
