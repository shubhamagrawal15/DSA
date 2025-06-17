import java.util.Arrays;

public class MergeSortInPlace {
    public static void main(String[] args) {
        int[]arr={5,4,3,2,1};
        mergesort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));

    }
    static void mergesort(int[]arr,int start,int end){
        if(end-start==1){
            return ;
        }
        int mid=(start+end)/2;
        mergesort(arr,start,mid);
        mergesort(arr,mid,end);

        merge(arr,start,mid,end);

    }

    static void merge(int[] arr,int start,int mid,int end){
        int[] mix = new int[end-start];
        int i =start;
        int j=end;
        int k=0;

        while (i<mid && j<end){
            if(arr[i]<arr[j]){
                mix[k]=arr[i];
                i++;
            }
            else{
                mix[k]=arr[j];
                j++;
            }
            k++;
        }

        // it may be possible that one of the arrays is not complete...add all the remaining elements in the new array as it is
        while(i<mid){
            mix[k]=arr[i];
            i++;
            k++;
        }
        while(j<end){
            mix[k]=arr[j];
            j++;
            k++;
        }

        for (int l = 0; l <mix.length ; l++) {
            arr[start+l]=mix[l];
        }
    }
}
