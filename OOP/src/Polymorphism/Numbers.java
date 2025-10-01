package Polymorphism;

public class Numbers {
    int sum(int a ,int b){
        return  a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Numbers number = new Numbers();
        number.sum(2,3);
        number.sum(2,4,8);

    }
}
