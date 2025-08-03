package AbstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(25);
        son.career();

        Daughter daughter= new Daughter(22);
        daughter.career();

        Parent.hello();
        son.normal();


//        Parent mom = new Parent(25)

    }
}
