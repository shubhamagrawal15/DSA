public class MagicNumber {
    public static void main(String[] args) {
     int n=5;
     int answer =0;
     int base =5;
     // the loops will run number of times the number of bits in a binary format
     while(n>0){
         int last=n&1;
         n=n>>1;
         answer=answer+last*base;
         base=base*5;
     }

        System.out.println(answer);
    }

}
