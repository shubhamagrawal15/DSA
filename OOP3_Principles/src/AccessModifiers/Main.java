package AccessModifiers;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        A obj = new A(10,"shubham");

        // need to do a few things
        // 1.access the data members
        // 2.modify the data members

        System.out.println(obj.getNum());
        int number = obj.num;

    }
}
