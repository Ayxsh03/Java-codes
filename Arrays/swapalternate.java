//You have been given an array/list(ARR) of size N. You need to swap every pair of alternate
//You don't need to print or return anything, just change in the input array itself.

package Arrays;

import java.util.Scanner;

public class swapalternate {
    public static int[] takeInput(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        return arr;
    }
    public static void alternate(int[] arr){
        for (int i = 0; i < arr.length-1; i=i+2) {
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
            
        }
    }
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+ " "); 
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int w=sc.nextInt();
        for (int i = 0; i < w; i++) {
            int []arr=takeInput();
            alternate(arr);
            printArray(arr);
        }  
        sc.close();
    }
}
