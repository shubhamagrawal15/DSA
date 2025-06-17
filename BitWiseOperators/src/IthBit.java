public class IthBit {
    public static void main(String[] args) {

        int number =13;
        int position =3;


//        int bit = Ith(number,position);
//        System.out.println("The " + position + "th bit is: " + bit);

//        int bit = maskMethod(number,position);
//        System.out.println("The " + position + "th bit is: " + bit);

          int bit=anotherMasking(number,position);
          System.out.println("The " + position + "th bit is: " + bit);

    }
    static int Ith(int number,int position){
        return(number>>position)&1;
    }

    static int maskMethod(int number,int position){

        int mask = 1<<position;

        if((number&mask)!=0){
            return 1;
        }else {
            return 0;
        }

    }

    static int anotherMasking(int number,int position){
        int mask = (1<<(position-1));

        if((number&mask)!=0){
            return 1;
        }
        else{
            return 0;
        }

    }


}
