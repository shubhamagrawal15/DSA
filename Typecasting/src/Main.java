import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // automatic casting from  a smaller datatype into larger i.e int to float
        float num = input.nextFloat();
        System.out.println(num);

        // explicit type conversion
        int num1 = (int)(67.56f);    //67


        // automatic type promotion in expressions
        int a =257;
        byte b = (byte)(a);  // 257 % 256

        System.out.println(b);

//        byte b =50;
//        b=b*5;

        int number = 'A';
        System.out.println(number);


        byte z = 42;
        char c ='a';
        short s = 1024;
        int  i = 50000;
        float f =5.67f;
        double d = 0.1234;
        double result  = (f*z)+(i/c)-(d*s);  // float+int-double = double;
        System.out.println((f*z)+ " " + (i/c)+ " "+(d*s));
        System.out.println(result);




    }

}