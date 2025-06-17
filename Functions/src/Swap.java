public class Swap {
    public static void main(String[] args) {

        int a =20;
        int b=30;
        // swap numbers code
//        int temp = a;
//        a=b;
//        b=temp;
        swap(a,b);
        System.out.println(a+" " + b);



        String name = "Shubham Agrawal";
        changeName(name);
        System.out.println(name);




    }


    static void swap(int a,int b){
        int temp = a;
        a=b;
        b= temp;

    }
    static void changeName(String name)
    {
        name = "Rahul Rana";
    }
}
