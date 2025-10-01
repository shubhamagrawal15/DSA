package ObjectCloning;

import java.util.Arrays;

public class Main{
    public static void main(String[] args) throws CloneNotSupportedException {
        Human kunal = new Human(25,"kunal");
//        Human twin = new Human(kunal);
        // this takes lot of processing time
        // we can use the clone method

        Human twin =(Human)kunal.clone();
        System.out.println(twin.age);
        System.out.println(twin.name);
        System.out.println(Arrays.toString(twin.arr));
        twin.arr[0]=100;
        System.out.println(Arrays.toString(kunal.arr));   // also changed ----shallow copy same refernce for only objects
        // that was shallow copy



        // deep copying

        









    }
}
