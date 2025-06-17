
public class basic {
    public static void main(String[] args) {
       int[] arr ={1,2,4,7,8,9,22,52,87,79,99};
       int target =52;

       int result = search(arr,target);

       if(result!=-1){
           System.out.println("Element found at "+result);
       }else{
           System.out.println("Element not found");
       }

     }

     static int search(int[]arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            // find the middle element
//            int mid=(start+end)/2;
            int mid = start+(end-start)/2;
            if(target==arr[mid]){
                return mid;
            }
            if(target>arr[mid]){
                start=mid+1;
            }
            if(target<arr[mid]){
                end=mid-1;
            }
        }
      return -1;
     }
}