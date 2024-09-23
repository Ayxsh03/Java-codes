//You are given an array arr[] containing positive integers. These integers can be from 1 to p, 
//Your task is to count the frequency of all numbers that lie in the range 1 to n.
//Input: n = 4, arr[] = [3, 3, 3, 3], p = 3
//Output: [0, 0, 4, 0]

package Hashing;

import java.util.HashMap;

public class frequencycount {
    public static void frequencyCount(int arr[], int N, int P) {
        HashMap<Integer,Integer> map= new HashMap<>();

        for(int i=0; i<arr.length ;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }
            else{
                map.put(arr[i], 1);
            }
        }


        for(int keys : map.keySet()){
           
        }
    }
}
