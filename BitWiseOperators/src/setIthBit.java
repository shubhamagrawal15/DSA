public class setIthBit {
    public static void main(String[] args) {
        int number =182;
        int position = 4;
        int ans = set(number,position);
        System.out.println(ans);
    }
    static int set(int number,int position){
        int mask=1<<(position-1);
        return (number|mask);
    }
    static int set2(int number,int position){
        int mask=1<<(position);
        return (number|mask);
    }
}
