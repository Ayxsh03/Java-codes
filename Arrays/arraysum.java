//Given an array/list(ARR) of length N, you need to find and return the sum of all the elements 
//in the array/list.

package Arrays;
import java.util.*;
public class arraysum {
    public static int sumArray(int[] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
        }
        return sum;
    }
    public static int[] takeInput(){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //No of arrays whose sum to be known
        int n=sc.nextInt();
        for (int i =0; i <n; i++) {
            int arr[]=takeInput();
            int sum=sumArray(arr);
            System.out.println("Sum of array= "+sum);
        }
    }
}
