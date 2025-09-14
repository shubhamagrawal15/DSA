package Strings.Easy;

public class ReverseEveryWordInAString {
    public static void main(String[] args) {

        String str= "Welcome     to the new world";
        StringBuilder result = new StringBuilder();
        str = str.trim();
        String[] modified = str.split("\\s+");
        for (int i = modified.length-1; i>=0 ; i--) {
            result.append(modified[i]+" ");
        }

        System.out.println(result.toString());





    }
}
