package Array;

import java.rmi.MarshalledObject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[]arr={3,2,4};
        int target=6;
        System.out.println(Arrays.toString(twoSum4(arr,target)));



    }
    static  int[] twoSum(int[]arr,int target){
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[i]+arr[j]==target){
                    return new int[]{i,j};
                }
            }
        }

        return new int[]{};

    }
    static int[] twoSum2(int[]arr,int target){

        for (int i = 0; i < arr.length ; i++) {
            int j=i+1;
            while(j< arr.length){
                if(target-arr[i]==arr[j]){
                    return new int[]{i,j};
                }else{
                    j++;
                }
            }
        }
        return new int[]{};
    }

    static  int[] twoSum3(int[]arr,int target){
        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i <arr.length ; i++) {
//            int[]arr={2,5,5,11};
//            int target=10;
            int remaining=target-arr[i];
            if(map.containsKey(remaining)){
                return new int[]{i, map.get(remaining)};
            }else{
                map.put(arr[i],i);
                System.out.println(map);

            }
        }
        return new int[]{};
    }

    static int[] twoSum4(int[]arr,int target){
        int i=0;
        int j= arr.length-1;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        while(i<j){
            if(arr[i]+arr[j]==target) return new int[]{i,j};
            else if (arr[i]+arr[j]>target) j--;
            else i++;

        }
        return new int[]{};
    }
}
