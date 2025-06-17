public class StringExample {
    public static void main(String[] args) {
         String message = greet();
        System.out.println(message);

        String message1 = personalizedGreet("shubham");
        System.out.println(message1);
    }

    static  String greet(){
        String greeting ="how are you";
        return greeting;
    }
    static String personalizedGreet(String name){
        String message = "hello" +name;
        return message;
    }
}
