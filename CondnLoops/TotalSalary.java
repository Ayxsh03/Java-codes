// Write a program to calculate the total salary of a person. The user has to enter the basic salary 
//(an integer) and the grade (an uppercase character), depending upon which the total salary is calculated
// Total_salary = Basic + HRA + DA + Allow – PF
// HRA   = 20% of basic
// DA    = 50% of basic
// Allow = 1700 if grade = ‘A’
// Allow = 1500 if grade = ‘B’
// Allow = 1300 if grade = ‘C' or any other character
// PF    = 11% of basic.
//Round off the total salary and then print the integral part only.

package CondnLoops;
import java.util.Scanner;
public class TotalSalary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sal=sc.nextInt();
        char grade=sc.next().charAt(0);
        int allow;
        if(grade=='A'){
            allow=1700;
        }
        else if(grade=='B'){
            allow=1500;
        }
        else{
            allow=1300;
        }
        double TotalSalary=(sal+0.7*sal+allow-0.11*sal);
        int t=(int)Math.round(TotalSalary);
        System.out.println(t);
        sc.close();
    }
    
}
