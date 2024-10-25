package SearchSort;

import java.util.*;
public class linear {
    public static int[] takeInput(){
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    public static void linearSearch(int[]arr, int key){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==key){
                System.out.println("element found at index "+ i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []arr=takeInput();
        int key=sc.nextInt();
        linearSearch(arr, key);
        sc.close();
    }
    
}