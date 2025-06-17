import java.util.Scanner;

public class LearningSwitches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fruit = input.next();

        // alt+enter
        switch (fruit) {
            case "mango" -> System.out.println("king of fruits");
            case "apple" -> System.out.println("A sweet red fruit");
            case "Orange" -> System.out.println("Round Fruit");
            case "grapes" -> System.out.println("Small fruit");
            default -> System.out.println("please enter a valid fruit");
        }

        int day = input.nextInt();
        switch (day) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thrusday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("please enter a valid date");
                break;
        }
    }
}
