import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
     sum();
     int ans = sum2();
        System.out.println(ans);
    }



    /*
    function syntax
    access_modifier    return_type name(){
    return statement
    }
     */

    static void sum(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number 1 :");
        int num1 = input.nextInt();
        System.out.println("enter 2nd number :");
         int num2 = input.nextInt();
         int sum = num1+num2;
        System.out.println("the sum is equal to  "+ sum);

    }

    // returning the value
    static int sum2(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number 1 :");
        int num1 = input.nextInt();
        System.out.println("enter 2nd number :");
        int num2 = input.nextInt();
        int sum = num1+num2;
        return sum;
    }
}
