package introduction;

public class Main {
    public static void main(String[] args) {

        // store  roll nos
        int[]nums=new int[5];

        // store 5 names
        String[] names = new String[5];

        // data of 5 students:{roll no,name,marks}
        int[] rollno = new int[5];
        String[] name=new String[5];
        float[] marks=new float[5];

        // own datatype---- we can create our own datatype using classes
        Student[] students = new Student[5];

//        Student kunal;
//        kunal = new Student();

        Student kunal = new Student();
        kunal.rollno=56;
        kunal.name="kunal";
        kunal.marks =94.5f;


        System.out.println(kunal.marks);

        // allocating values during object creation------construtor--- defines what will happen when your object will be created
        Student shubham=new Student();
        System.out.println(shubham.rollno);


        shubham.changeName("prince");
        shubham.greeting();


    }

    // class ---- named group of properties and functions
    // object-----instance of a class
    // syntax for creating a class


}
class Student{
    int rollno;
    String name;
    float marks;

    void greeting(){
        System.out.println("HEllo My name is "+this.name);
    }

    void changeName(String newName){
        name=newName;
    }

    Student(){
        this.rollno=43;
        this.name="shubham";
        this.marks=89.0f;
    }



    Student(int rollno,String name,float marks){
        this.rollno=rollno;
        this.name=name;
        this.marks=marks;
    }

}
