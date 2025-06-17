//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        int a = 10;  // primitive stored in stack memory

        int[]arr={2,3,5,4,19};  // refernce variable arr is stored in stack pointing to the object{2,3,5,4} in the heap
        // any change made via arr will be reflected in the main object

        String name = "Shubham Agrawal";

//        System.out.println(name);
        String a ="Shub";
        System.out.println(a);
        a="agrawal";  // here we arent changing the object instead creating a new object
        System.out.println(a);




    }
}