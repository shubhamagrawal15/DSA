public class searchInMountain {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,3,2,1};
        int target=3;
        System.out.println("Target element is at "+search(arr,target));

    }


    static int search(int[]arr,int target){
     int peakIndex=peakElement(arr);
     int firstTry=orderABS(arr,target,0,peakIndex);
     if(firstTry!=-1){
         return firstTry;
     }return orderABS(arr,target,peakIndex+1,arr.length-1);
    }
    static int orderABS(int[]arr, int target,int start,int end){


        // find whether the array is sorted in ascending or descending

        boolean isAsc;
        if(arr[start]<arr[end]){
            isAsc=true;
        }else{
            isAsc=false;
        }



        while(start<=end){
            int mid = start+(end-start)/2;

            if(target==arr[mid]){
                return mid;
            }
            if(isAsc){
                if(target>arr[mid]){
                    start=mid+1;
                }
                if(target<arr[mid]){
                    end=mid-1;
                }
            }
            else {
                if(target<arr[mid]){
                    start=mid+1;
                }
                if(target>arr[mid]){
                    end=mid-1;
                }
            }

        }
        return -1;

    }
    static  int peakElement(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]<arr[mid+1]){
                start=mid+1;
            } else if (arr[mid]>arr[mid+1]) {
                end =mid;
            }
        }
        return start;
    }
}
