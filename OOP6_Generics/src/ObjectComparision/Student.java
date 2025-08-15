package ObjectComparision;

public class Student implements Comparable<Student> {
    int roll_no;
    float marks;


    public Student(int roll_no,float marks){
        this.roll_no=roll_no;
        this.marks=marks;
    }

    @Override
    public String toString() {
        return roll_no+" ";
    }

    @Override
    public int compareTo(Student o) {
      int diff = (int)(this.marks-o.marks);

      // if diff = 0 means both are equal
        //  if diff<0 means o is bigger

      return diff;
    }
}
