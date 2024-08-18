package OOPS1;

public class final_this {
    public class Student {
        String name;
        private final int rollno;
        /*final initailized at only 2 places->where created, inside constructorr

        1. private final int rollno= 7; //every student will have same rollno

        2. public Student(String n){
            name=n;
            rollno=100; //every student will have same rollno
        }*/
        public int getRollNo(){
            return rollno;
        }

        public Student(String n, int r){
            name=n;
            rollno=r;
        }

        /*Setter function will give error because rollno is FINAL
        public void setRollNo(int x){
            if(rollno<=0){
                return;
            }
            rollno = x;    
        }*/

        /*public Student(String name, int rollno){
            this.name=name;
            this.rollno=rollno;
        }*/
        
    }
}
