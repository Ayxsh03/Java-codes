package Arrays;

import java.util.ArrayList;

public class remove_consequtive_duplicates {
//arr -> 10 10 10 20 20 30 40 40 10 remove-> 10 20 30 40 10

    public static ArrayList<Integer> remConsDuplicates(int arr[]){
        ArrayList<Integer> a=new ArrayList<>();
        a.add(arr[0]); //first element must be there
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                a.add(arr[i]);
            }
        }
        return a;
    }
    public static void main(String[] args) {
        int[] arr={10, 10, 10, 20, 20, 30, 40, 40, 10};
        ArrayList<Integer> a= remConsDuplicates(arr);
        for(int i=0;i<a.size();i++){
            System.out.print(a.get(i)+" ");
        }
    }
}
