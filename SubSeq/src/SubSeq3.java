import java.util.ArrayList;
import java.util.Arrays;

public class SubSeq3 {
    public static void main(String[] args) {
        System.out.println(subseqRet("","abc"));
    }

    static ArrayList<String> subseqRet(String processed,String Unprocessed){
         ArrayList<String> list = new ArrayList<>();
         if(Unprocessed.isEmpty()){
             list.add(processed);
             return list;
         }
         char ch = Unprocessed.charAt(0);
         ArrayList<String> left = subseqRet(processed+ch,Unprocessed.substring(1));
         ArrayList<String> right = subseqRet(processed,Unprocessed.substring(1));

         left.addAll(right);
         return left;


    }


}

