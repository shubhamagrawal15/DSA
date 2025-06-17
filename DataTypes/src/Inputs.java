import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter some input");
        int roll_no = input.nextInt();
        System.out.println("Yor roll number is " + roll_no );

        String name = input.next();
        System.out.println("Hey my name is  "+  name);


        float marks = input.nextFloat();
        System.out.println(marks);
    }
}
