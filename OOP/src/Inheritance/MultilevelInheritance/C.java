package Inheritance.MultilevelInheritance;

public class C  extends  B{
    int width;
    C(int length,int height,int width){
        super(length,height);
        this.width=width;

    }

    public static void main(String[] args) {
        C obj = new C(10,20,30);
        System.out.println(obj.length+" "+obj.height+" "+ obj.width);
    }
}
