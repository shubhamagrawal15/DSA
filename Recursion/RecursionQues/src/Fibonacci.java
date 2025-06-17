
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(Fibona(4));
    }

    static int Fibona(int n){

        //base condition:
        if(n<2){
            return n;
        }
        // this is not the tail recursion as the last call is adding two values after getting it from functions not executing only
        return Fibona(n-1)+Fibona(n-2);
    }
}