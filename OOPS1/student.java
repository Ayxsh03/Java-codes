package OOPS1;

public class student {
    String name;
    private int rollno; //only accessed in same class

    //Getter function to get access to roll no from anywhere
    public int getRollNo(){
        return rollno;
    }

    /*Benefit of using getter,setter and private is we can have control and final check*/

    //Setter function to set rollno from anywhere
    public void setRollNo(int x){
        //control example
        if(rollno<=0){
            return;
        }
        rollno = x;
        
    }
    //Constructor
    public student(String n, int r){
        name=n;
        rollno=r;
        numStudents++;
    }
    //Constuctor 2
    public student(String n){
        name=n;
        numStudents++;
    }
    
    public void print(){
        System.out.println(name+" "+rollno);
    }

    private static int numStudents;
    //Getter
    public static int getNumStudents(){
        return numStudents;
    }


}