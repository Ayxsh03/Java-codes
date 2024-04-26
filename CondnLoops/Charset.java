/*
Write a program that takes a character as input and prints 1, 0, or -1 according to the following rules.
1, if the character is an uppercase alphabet (A - Z).
0, if the character is a lowercase alphabet (a - z).
-1, if the character is not an alphabet.
*/
package CondnLoops;
import java.util.*;
public class Charset {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char A=sc.next().charAt(0);
        if(A>=65 && A<=90){
            System.out.println("1");
        }
        else if(A>=97 && A<=122){
            System.out.println("0");
        }
        else{
            System.out.println("-1");
        }
        // Boolean b=Character.isUpperCase(A);
        // Boolean c= Character.isLowerCase(A);
        // if(b==true){
        //     System.out.println("1");
        // }
        // else if(c==true){
        //     System.out.println("0");
        // }
        // else{
        //     System.out.println("-1");
        // }

    }
    
}
