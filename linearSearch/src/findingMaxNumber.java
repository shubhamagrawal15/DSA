public class findingMaxNumber {
    public static void main(String[] args) {
        int[]arr = {1,8,9,7,5,6,8,10,879,45};
        int maximumValue = maximum(arr);
        System.out.println(maximumValue);


    }

    static  int maximum(int[]arr){
        if(arr.length==0){
            return -1;
        }
        int max=arr[0];

        for (int i = 0; i <arr.length ; i++) {

            if(arr[i]>max){
               max = arr[i];
            }

        }
        return max;
    }
}
