import java.util.ArrayList;

public class operators {
    public static void main(String[] args) {
        System.out.println(('a'+'b'));
        System.out.println("a"+"b");
        System.out.println('a'+3);
        System.out.println((char)('a'+3));


        System.out.println("a"+3); // when an interger is concatenated  with a string it is converted into wrapper class integer that will call to String
        // this is same as after few steps:"a"+"1"


        System.out.println("kunal"+  new ArrayList<>());

        System.out.println("kunal"+new Integer(56));


//        System.out.println(new Integer(56)+ new ArrayList<>());
        // the operator +  in java is only defined for primitives and when any one of these values is a string

        System.out.println(new Integer(56)+"shub"+ new ArrayList<>());
    }
}
