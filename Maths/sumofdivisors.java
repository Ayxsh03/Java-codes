/*
You are given an integer ‘n’.
Function ‘sumOfDivisors(n)’ is defined as the sum of all divisors of ‘n’.
Find the sum of ‘sumOfDivisors(i)’ for all ‘i’ from 1 to ‘n’.
sumOfDivisors(1) = 1
sumOfDivisors(2) = 2 + 1 = 3
sumOfDivisors(3) = 3 + 1 = 4
Therefore, the answer is sumOfDivisors(1) + sumOfDivisors(2) + sumOfDivisors(3) = 1 + 3 + 4 = 8.  */

package Maths;

import java.util.ArrayList;

public class sumofdivisors {
    //Print all divisors of n
    public static void divisors(int n){
        for(int i=1;i*i<=n;i++){ //or i*i<=n
            if(n%i==0){
                System.out.print(i+" ");
                if((n/i)!=i){
                    System.out.print(n/i+" ");
                }
            }
        }
    }
    
    //Store all divisors of n in List
    public static ArrayList<Integer> divisor(int n){
        ArrayList<Integer> divisors=new ArrayList<>();
        for(int i=1; i*i <=n;i++){
            if(n%i==0){
                divisors.add(i);
                if((n/i)!=i){
                    divisors.add(n/i);
                }
            }
        }
        divisors.sort(null);
        return divisors;
    }

    //Sum of all divisors of n
    public static int sumdivisors(int n){
        int sum=0;
        for(int i=1; i<=n;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        return sum;
    } 

    //Sum of all divisors for all ‘i’ from 1 to ‘n’. $NOT ACCEPTED$
    public static int sumOfAllDivisors(int n){
        int totalsum=0;
        for(int i=1;i<=n;i++){
            int sum=0;
            for(int j=1; j*j<=i;j++){
                if(i%j==0){
                    sum+=j;
                    if((i/j)!=j){
                        sum+=(i/j);
                    }
                }
            }
            totalsum+=sum;
        }
        return totalsum;
    }
    
    //OPTIMISED Sum of all divisors for all ‘i’ from 1 to ‘n’. 
    public static long sumOfAllDivisor(int n){
        long sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+(i*(n/i));
        }
        return sum;
    }

    public static void main(String[] args) {
        int n=18;
        divisors(n);
        //System.out.println(sumOfAllDivisor(n));
 
    }
}
