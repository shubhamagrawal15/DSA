package Strings.Easy;

public class LargestOddNumberInAString {
    public static void main(String[] args) {

        /*

    String str= "021468";
    str=str.replaceFirst("^0+","");

    int length=str.length();

    int lastOddIndex=-1;

        for (int i = length-1; i >=0 ; i--) {
            int digit = str.charAt(i)-'0';
            if(digit%2!=0){
                lastOddIndex=i;
                break;
            }

        }

        String result = (lastOddIndex==-1)?"":str.substring(0,lastOddIndex+1);
        System.out.println(result);

*/

        // better approach

        String str = "01254386954";
        String result="";

        str=str.replaceFirst("^0+","");

        int length=str.length();

        for (int i = length-1; i >=0 ; i++) {
            if(((str.charAt(i)-'0') & 1) !=0){
                 result=str.substring(0,i+1);
                 break;
            }
        }


        System.out.println(result);
}


}