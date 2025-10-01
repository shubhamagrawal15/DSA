package StaticExample;

public class StaticInitialize {
    static int a =4;
    static int b;

    static {
        System.out.println("I am in static block");
        b=a*5;
    }

    public static void main(String[] args) {
        StaticInitialize obj = new StaticInitialize();
        System.out.println(StaticInitialize.a+" "+StaticInitialize.b);

        StaticInitialize.b+=3;
        System.out.println(StaticInitialize.a+" "+StaticInitialize.b);

        StaticInitialize obj2 = new StaticInitialize();
        System.out.println(StaticInitialize.a+" "+StaticInitialize.b);



    }

}
