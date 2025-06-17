import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    permutations("","abc");
    }

    static  void permutations(String processed,String Unprocessed){
        if(Unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch = Unprocessed.charAt(0);
        for (int i = 0; i <=processed.length() ; i++) {
            String first=processed.substring(0,i);
            String second = processed.substring(i, processed.length());
            permutations(first+ch+second,Unprocessed.substring(1));

        }
    }

    static ArrayList<String> permutations(String processed, String Unprocessed){
        if(Unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch = Unprocessed.charAt(0);




        for (int i = 0; i <=processed.length() ; i++) {
            String first=processed.substring(0,i);
            String second = processed.substring(i, processed.length());
            permutations(first+ch+second,Unprocessed.substring(1));

        }
    }
}