
public class SkipACharacter {
    public static void main(String[] args) {
//        String processed=" ";
        String unprocessed ="baccadh";
//        skip(processed,unprocessed);
        System.out.println(skip(unprocessed));


    }

    static void skip(String processed,String Unprocessed){

        // base condition
        if(Unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch = Unprocessed.charAt(0);
        if(ch=='a'){
            skip(processed,Unprocessed.substring(1));
        }else{
            skip(processed+ch,Unprocessed.substring(1));
        }

    }



    // returning a string

    static String skip(String Unprocessed) {
        if (Unprocessed.isEmpty()) {
            return " ";
        }

        char ch = Unprocessed.charAt(0);

        if(ch=='a'){
           return skip(Unprocessed.substring(1));
        }else{
            return ch+skip(Unprocessed.substring(1));
        }

    }
}
