public class Comparison {
    public static void main(String[] args) {
        String a ="Shubham";
        String b ="Shubham";
        String x = a;


        // ==
        System.out.println(a==b); // true because both a and b are pointing to the same object
        System.out.println(x==a);

        String c = new String(("shubham"));
        String d = new String("shubham");

        System.out.println(c==d);
        System.out.println(c.equals(d));


        System.out.println(d.charAt(0));
    }
}
