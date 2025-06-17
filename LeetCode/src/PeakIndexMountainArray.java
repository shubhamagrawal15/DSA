public class PeakIndexMountainArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,6,7,10,8, 4,3,2};
        System.out.println("Peak element is at "+peakElement(arr));

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
