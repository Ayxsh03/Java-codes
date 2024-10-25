//Given a number N, print sum of all even numbers from 1 to N.
package CondnLoops;
import java.util.*;
public class EvenSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=0;i<=n;i++){
            sum=sum+i;
            i++;
        }
        System.out.println(sum);
        sc.close();
    }
}
