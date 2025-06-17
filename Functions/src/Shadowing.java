public class Shadowing {
    /* shadowing ----a practice of using two variables with the same name within the scope that overlaps
    */static int x=90; // this will be shadowed at line 6

    public static void main(String[] args) {
        System.out.println(x); //90
        int x =40;       // the class variable at line 5 is shadowed by this
        System.out.println(x);  // scope will begin when value is initialized
        System.out.println(x);//40
        fun();
    }
    static void fun(){
        System.out.println(x);
    }
}
