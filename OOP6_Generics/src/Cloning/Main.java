package Cloning;

import java.util.Arrays;

public class Main  {

    public static void main(String[] args)  throws  CloneNotSupportedException{
        // this process takes a plot of time to execute

    Human kunal = new Human(41,"kunal");
//        Human twin = new Human(kunal);


        // object cloning

        Human twin = (Human)kunal.clone();
        System.out.println(twin.age + " " + twin.name);
        System.out.println(Arrays.toString(twin.arr));



        twin.arr[0]=100;
        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(kunal.arr));



        twin.name="mai copy hu kunal ka";
        System.out.println(twin.name);
        System.out.println(kunal.name);

    }

}
