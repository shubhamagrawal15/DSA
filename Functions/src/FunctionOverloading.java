public class FunctionOverloading {
    public static void main(String[] args) {
        fun(67);
        fun("shubham");
        int ans1 = sum(2,3);
        System.out.println(ans1);
        int ans2= sum(2,3,4);
        System.out.println(ans2);
    }
    // two function of the same name but different arguments/parameters-- function overlaoding happens at compile time
    static void fun(int a ){
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println(name);
    }

    static int sum(int a ,int b){
        return a+b;
    }
    static int sum(int a ,int b,int c){
        return a+b+c;
    }
}

