package Strings.Easy;

public class RotateString {
    public static void main(String[] args) {
        String str="shubham";
        String goal="bhamshu";
        System.out.println(rotate1(str,goal));
        System.out.println(rotate2(str,goal));


    }

    static  boolean rotate1(String str, String goal){
        for (int i = 0; i <str.length() ; i++) {
            str=str.substring(1)+str.charAt(0);


            if(str.equals(goal)){
                return  true;
            }
        }
        return false;
    }

    // another approach using string builder

    static boolean rotate2(String str,String goal){
        if(str.equals(goal)) return true;
        StringBuilder sb= new StringBuilder(str);
        System.out.println(sb);

        for (int i = 0; i <str.length(); i++) {
            char ch =sb.charAt(0);
            sb.deleteCharAt(0);
            sb.append(ch);

            if(sb.toString().equals(goal)){
                return  true;
            }
        }
        return false;
    }

    // another apprach
    static boolean rotate3(String str,String goal){

        if(str.length()==goal.length()&&((str+str).contains(goal))) return true;

        return false;
    }
}
