
public class EvenDigits {
    public static void main(String[] args) {

       int[] arr={12,345,2,6,7896};
//        System.out.println("even digits in an array:"+findNumbers(arr));
        System.out.println(findNumber(arr));

    }


    static int findNumbers(int[]arr){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(digitCount(arr[i]) % 2 ==0){
                count++;
            }
        }
        return count;

    }
    static int digitCount( int num){
        if(num==0){
            return 1;
        }
        return (int) (Math.log10(Math.abs(num))+1);
    }


    static int findNumber(int[]arr){
        int count =0;
        for(int num:arr){
            if(even(num)){
                count++;
            }
        }
        return count++;
    }

    static boolean even(int num){
        int count=0;
        while(num>0){
            count++;
            num=num/10;
        }
        return count%2==0;
    }


}