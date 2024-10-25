package Arrays;
import java.util.*;
public class allpairs {
    public static int[] takeInput(){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        return arr;
        
    }
    public static void pairs(int []arr){
        for (int i = 0; i < arr.length; i++) {
            for(int j=i+1; j<arr.length; j++){
                System.out.print("(" +arr[i] +","+arr[j]+")");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=takeInput();
        pairs(arr);
        sc.close();
    }

}
