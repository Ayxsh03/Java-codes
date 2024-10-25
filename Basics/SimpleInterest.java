/*
Take the principal amount, rate of interest, and the time period as input and calculate the Simple Interest.
Note: Print the answer as integer value.
 */
package Basics;
import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        float p=sc.nextFloat();
        float r=sc.nextFloat();
        float t=sc.nextFloat();
        int si=(int)((p*r*t)/100);
        System.out.println(si);
        sc.close();
    }
}
