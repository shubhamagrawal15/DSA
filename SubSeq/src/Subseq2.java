import java.util.ArrayList;
import java.util.Arrays;

public class Subseq2 {
    public static void main(String[] args) {
        subseq2("","abc",arr);
        System.out.println(arr);
    }
    static ArrayList<String> arr = new ArrayList<>();
    static void subseq2(String processed, String unprocessed,ArrayList<String> arr){
        if (unprocessed.isEmpty()){
            arr.add(processed);
            return;
        }
        char ch = unprocessed.charAt(0);

        subseq2(processed+ch,unprocessed.substring(1),arr);
        subseq2(processed,unprocessed.substring(1),arr);
    }

}
