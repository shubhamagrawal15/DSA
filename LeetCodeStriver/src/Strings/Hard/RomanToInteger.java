package Strings.Hard;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("V"));
    }

    public static int romanToInt(String s){
        Map<Character,Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int total=0;

        for (int i = 0; i <s.length() ; i++) {

            int value = map.get(s.charAt(i));

            if(i+1<s.length()&& value<map.get(s.charAt(i+1))){
                total=total-value;
            }
            else{
                total=total+value;
            }
        }


        return total ;
    }
}
