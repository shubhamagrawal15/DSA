package HashQuestions;
import java.util.*;

// Given an integer array of size n , find all elements that appear more than [n/3] times

public class MajorityElement {

    public static void main(String[] args) {
        int[]nums={1,3,2,5,1,3,1,5,1};
        bruteCount(nums);

    }
//    static void count(){
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for(Map.Entry<Integer,Integer> e : map.entrySet()){
//            if(){
//
//            }
//        }
//    }

    static void bruteCount(int[]arr){
        int n= arr.length;
        boolean[] visited=new boolean[n];

        for (int i = 0; i < n; i++) {
            if(visited[i]){
                continue;
            }
            int count=1;
            for (int j = i+1; j <n; j++) {
                if(arr[i]==arr[j]){
                    count++;
                    visited[j]=true;
                }
            }

            if(count>n/3){
                System.out.println(arr[i]);
            }
        }
    }


}
