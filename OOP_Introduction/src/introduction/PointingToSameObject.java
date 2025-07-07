package introduction;

public class PointingToSameObject {
    public static void main(String[] args) {
        Student2 one = new Student2();
        Student2 two = one;

        System.out.println(one.name);
        two.name="shubham";
        System.out.println(one.name);
    }
}

class Student2{
    int rollno;
    String name;
    float marks;
    Student2(){
        this(13,"default person",96.5f);
    }
    Student2(int roll,String naam,float mark){  /// constructor overloading
        this.rollno=roll;
        this.name=naam;
        this.marks=mark;
    }
}
