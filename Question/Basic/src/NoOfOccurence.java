import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class NoOfOccurence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int ToFind =input.nextInt();
        int count =0;

        while(number>0){
            int rem=number%10;
            if(rem==ToFind){
                count++;
            }
            number=number/10;
        }
        System.out.println(count);
    }


}