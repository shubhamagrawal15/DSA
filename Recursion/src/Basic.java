public class Basic {
    public static void main(String[] args) {
       print1(1);
    }

    static void print1(int n) {

        // Base Condition
        if(n==5){
            System.out.println(n);
            return;
        }

        System.out.println(n);
        // recursive call
        // if we are calling a function again and again, we can treat it as a separate call in the stack

        // this is called tail recursion
        // this is the last function call
        print1(n+1);

    }
}
