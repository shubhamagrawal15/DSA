package Recursion;

public class printHello {
    public static void main(String[] args) {
     printHello(5);
    }

    static void printHello(int n){
        if(n<=0){
            return;
        }
        System.out.println("heelo world");
        printHello(--n);
    }
}
