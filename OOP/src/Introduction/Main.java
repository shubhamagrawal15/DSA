package Introduction;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[5];

//        Student kunal = new Student();
//        kunal.rollno=13;
//        kunal.marks=88.5f;
//        kunal.name="kunal";

        Student kunal = new Student("kunal",30,98.5f);



        System.out.println(kunal.rollno);
        System.out.println(kunal.name);
        System.out.println(kunal.marks);
        kunal.greeting();


    }


}
class Student{
    int rollno;
    String name;
    float marks;

    void greeting(){
        System.out.println(" my name is "+ this.name);
    }

    void changeName (String newname){
        this.name=newname;
    }

    Student(String name,int rollno,float marks){
     this.name=name;
     this.rollno=rollno;
     this.marks=marks;
    }
}

