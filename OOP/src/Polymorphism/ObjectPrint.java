package Polymorphism;

public class ObjectPrint {
    int num;
    ObjectPrint(int num){
        this.num=num;
    }
    @Override
    public String toString(){
        return  "hello world";
    }
    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(54);
        System.out.println(obj);
    }
}
