import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int empId = input.nextInt();
        String department = input.next();

        switch (empId) {
            case 1 -> System.out.println("Kunal khushwana");
            case 2 -> System.out.println("shubham agrawal");
            case 3 -> {
                System.out.println("Emp no 3");
                switch (department) {
                    case "IT" -> System.out.println("IT department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("no department entered");
                }
            }
            default -> System.out.println("enter correct empId");
        }
    }
}
