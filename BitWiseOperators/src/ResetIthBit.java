public class ResetIthBit {
    public static void main(String[] args) {

        // 0->0 1->0
        int number =9;
        int position =3;

        int answer = reset(number,position);
        System.out.println(answer);


    }

    static int reset(int number,int position){
        int mask=~(1<<(position-1));
        return (number&mask);
    }
}
