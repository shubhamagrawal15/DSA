public class MaximumItem {
    public static void main(String[] args) {
        int[] arr = {1,5,7,89,75,85,526,850,55,557,78};

        maxitem(arr);

    }
    static  void maxitem(int[]arr){
        int max =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }

        }
        System.out.println(max);
    }
    static  void maxRange(int[]arr,int start,int end){
        int max =0;
        for(int i=start;i<=end;i++){
            if(arr[i]>max){
                max=arr[i];
            }

        }
        System.out.println(max);
    }
}
