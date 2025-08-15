package ObjectComparision;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student shubham = new Student(12,83);
        Student rahul = new Student(5,85);

        Student arpit = new Student(2,95.52f);
        Student karan = new Student(13,77.52f);
        Student sachin = new Student(9,96.52f);


//        int[]arr= new int[5];
        Student[] list = {shubham,rahul,arpit,karan,sachin};

        System.out.println(Arrays.toString(list));


        // this is not the way to compare the objects
    /*
    if(shubham<rahul){
        System.out.println("rahul has more marks");
    }
     */

        // this is the way
        if(shubham.compareTo(rahul)<0){
            System.out.println("rahul has more marks");
            System.out.println(shubham.compareTo(rahul));
        }
    }

}
