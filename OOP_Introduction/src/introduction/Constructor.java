package introduction;

public class Constructor {
    public static void main(String[] args) {

        Student1 kunal = new Student1(13,"ku",89.5f);
        System.out.println(kunal.name + " got " + kunal.marks + " marks.");

        Student1 random = new Student1(kunal);
        System.out.println(kunal.name + " got " + kunal.marks + " marks.");


        Student1 random2 = new Student1();
        System.out.println(random2.name + " got " + random2.marks + " marks.");



    }

}
class Student1{
    int rollno;
    String name;
    float marks;





    // Student1 arpit = new Student1(17,"Arpuu",58.3f)
    // here this will be replaced by arpit
    Student1(int roll,String naam,float mark){  /// constructor overloading
        this.rollno=roll;
        this.name=naam;
        this.marks=mark;
    }

    Student1(Student1 other){
        this.name=other.name;
        this.rollno=other.rollno;
        this.marks=other.marks;
    }

    // calling a constructor from aonther constructor
    Student1(){
        this(13,"default person",96.5f);
    }
}
