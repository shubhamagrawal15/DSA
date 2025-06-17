import java.util.ArrayList;

public class SubSequenceWithAsciiValues {
    public static void main(String[] args) {
        String processed="";
        String Unprocessed="abc";
        subseqAscii(processed,Unprocessed);
        System.out.println(subseqRet(processed,Unprocessed));
    }

    static  void subseqAscii(String processed,String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);
        subseqAscii(processed+ch,unprocessed.substring(1));
        subseqAscii(processed,unprocessed.substring(1));
        subseqAscii(processed+(ch+0),unprocessed.substring(1));
    }

    static ArrayList<String> subseqRet(String processed, String Unprocessed){
        ArrayList<String> list = new ArrayList<>();
        if(Unprocessed.isEmpty()){
            list.add(processed);
            return list;
        }
        char ch = Unprocessed.charAt(0);
        ArrayList<String> first = subseqRet(processed+ch,Unprocessed.substring(1));
        ArrayList<String> second = subseqRet(processed,Unprocessed.substring(1));
        ArrayList<String> third = subseqRet(processed+(ch+0),Unprocessed.substring(1));


        first.addAll(second);
        first.addAll(third);
        return first;


    }
}
