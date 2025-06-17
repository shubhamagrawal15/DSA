//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Nto1 {
    public static void main(String[] args) {
        fun(5);
        funRev(5);
        funBoth(10);
    }

    static void fun(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        fun(n-1);
    }
    static void funRev(int n){
        if(n==0){
            return;
        }

        funRev(n-1);
        System.out.println(n);
    }

    static void funBoth(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        funBoth(n-1);
        System.out.println(n);
    }

}