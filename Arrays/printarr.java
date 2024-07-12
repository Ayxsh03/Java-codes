package Arrays;
import java.util.*;

public class printarr {
    
    public static int[] takeInput(){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+ " "); 
        }
    }
    
    public static void main(String[] args) {
       int[] arr=takeInput();
       printArray(arr);
    }  
}
