package OOPS1;

public class studentuse {
   public static void main(String[] args) {
    
    /*student s1=new student(); //error bcoz default const only available till a new const is created
    s1.name="ayush";
    s1.setRollNo(7);*/

    //Creating object by constructor
    student s1=new student("Ayush",7);

    //s1.rollno=1; Cant use as rollno is now private
    System.out.println(s1.name);
    System.out.println(s1.getRollNo());

    s1.print(); //print function

    student s2=new student("Akash"); //constructor 2
    s2.print();

    //System.out.println(student.numStudents);

    //student.numStudents=10; //It should not be allowed so it should be private

    System.out.println(student.getNumStudents());
    //System.out.println(s1.getNumStudents()); //can be called this way too
   }
   

}
