public class eg {
    public static void main(String[] args) {

        Person p = new Person("Shubham");
        System.out.println(p);
    }
   static class Person {
        String name;
        Person(String name) {
            this.name = name;
        }
    }
}
