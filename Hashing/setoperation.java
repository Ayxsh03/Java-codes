package Hashing;

import java.util.HashSet;

public class setoperation {
    public static int union(int arr1[], int[] arr2){
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int j=0;j<arr2.length;j++){
            set.add(arr2[j]);
        }
        return set.size();
    }

    public static int intersection(int arr1[], int[] arr2){
        HashSet<Integer> set=new HashSet<>();
        int count=0;
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int j=0;j<arr2.length;j++){
            if(set.contains(arr2[j])){
                System.out.println(arr2[j]);
                count++;
                set.remove(arr2[j]); //so that matching elements dont increaase count again
            }
        }
        return count;
    }
}
