package Array;

import java.util.*;

public class UniqueFrequencyElements {
    public static void main(String[] args) {
        int[]arr={1,1,1,2,2,3,3,4,4,4,4,4};
        System.out.println(unique(arr));

    }

    static boolean unique(int[]arr){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else {
                map.put(arr[i],1);
            }
        }
        System.out.println(map);

        ArrayList<Integer> list = new ArrayList<>();
        for(int key: map.keySet()){
            list.add(map.get(key));
        }

        Collections.sort(list);

        System.out.println(list);

        // comparison
        for (int i = 1; i <list.size() ; i++) {
            if(list.get(i).equals(list.get(i-1))){
               continue;
            }
            else {
                return false;
            }
        }

        return true;
    }

    // another approach after mapping all the values store all the elements in the hashset

    static boolean unique2(int[]arr){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else {
                map.put(arr[i],1);
            }
        }
        System.out.println(map);

        Set<Integer> freqValue= new HashSet<>();
        for(int freq:map.values()){
            if(!freqValue.add(freq)){
                return false;
            }
        }
        return true;
    }
}
