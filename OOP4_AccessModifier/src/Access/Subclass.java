package Access;

public class Subclass extends A{

    Subclass(int num,String name){
        super(num,name);
    }

    public static void main(String[] args) {
        Subclass obj = new Subclass(45,"shb");

        System.out.println(obj.num);
    }

}
