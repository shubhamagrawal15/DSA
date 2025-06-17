public class SkipAStringNotReq {
    public static void main(String[] args) {
        String unprocessed1="abcdefghappleijklmnopqrstuvwxyz";
        String unprocessed2="abcdefghappijklmnopqrstuvwxyz";
        System.out.println(skip(unprocessed1));
        System.out.println(skip(unprocessed2));

    }

    static String skip(String unprocessed){
        if(unprocessed.isEmpty()){
            return "";
        }
        if(unprocessed.startsWith("app") && !unprocessed.startsWith("apple")){
            return skip(unprocessed.substring(3));
        }else{
            return unprocessed.charAt(0)+skip(unprocessed.substring(1));
        }
    }

}
