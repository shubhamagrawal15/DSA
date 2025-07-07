package introduction;

public class WrapperEg {
    public static void main(String[] args) {
        int a =10;
        int b =20;
        Integer num=45;   // created as an object
        swap(a,b);

        System.out.println(a); // no change ... a still==10
        System.out.println(b); //no change ...  b still==20

        // but if we convert it into object and then swap then... still not swapped...because Integer is a final class

        Integer c=10;
        Integer d=20;
        swap(c,d);
        System.out.println(c);
        System.out.println(d);


        final int bonus =2;
//        bonus=3;      // cant modify




      final  A shubham = new A("Shubham Agrawal");
        System.out.println(shubham.name);
        shubham.name ="shub";   // works
        System.out.println(shubham.name);

        // when a non primitive is final we cant re assign it ...
//        shubham = new("new object")


        A obj;
        for (int i = 0; i <1000 ; i++) {
            obj= new A("random name");
        }



    }

    static void swap(int a ,int b){
        int temp=a;
        a=b;
        b=temp;
    }
    static void swap(Integer c ,Integer d){
        int temp=c;
        c=d;
        d=temp;
    }
}


class A{
    final int num=10;
    String name;
    A(String name){

        this.name=name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}
