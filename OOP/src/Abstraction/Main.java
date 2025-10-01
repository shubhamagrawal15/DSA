package Abstraction;

public class Main {
    public static void main(String[] args) {
     Son son = new Son(25);
     son.career();
     son.normal();

     Daughter daughter= new Daughter(22);
     daughter.career();

     Parent.hello();

    }
}
