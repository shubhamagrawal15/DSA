package Array;

public class SingleElementInASortedArray {
    public static void main(String[] args) {
        int[]arr={1,1,2,2,3,3,4,4,8,8,9};
        System.out.println(singleElement(arr));
    }

    static  int singleElement(int[]arr){
        int[] map =new int[100];
        System.out.println(map);
        for (int i = 0; i < arr.length ; i++) {
            map[arr[i]]++;
        }
        for (int i = 0; i < map.length ; i++) {
            if(map[i]==1){
                return i;
            }
        }

        return 0;
    }

}

