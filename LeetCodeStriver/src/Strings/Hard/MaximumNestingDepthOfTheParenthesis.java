package Strings.Hard;

public class MaximumNestingDepthOfTheParenthesis {
    public static void main(String[] args) {
        String str="(1+(2*3)+((8)/4))+1";
        String modified = str.replaceAll("[^()]","");
        System.out.println(modified);


        int depth=0;
        int max=0;
        for (int i = 0; i <modified.length() ; i++) {
            char ch = modified.charAt(i);
            if(ch=='('){
                depth++;
            }
            if(ch==')'){
                depth--;
            }
            if(depth>max){
                max=depth;
            }
        }
        System.out.println(max);

    }
}
