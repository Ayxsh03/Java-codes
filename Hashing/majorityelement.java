package Hashing;

import java.util.HashMap;

public class majorityelement {
    public static int maxcount(int [] arr){
        HashMap<Integer,Integer> map=new HashMap<>();
        //Find frequency of all elements of arr
        for(int i=0; i<arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }
            else{
                map.put(arr[i], 1);
            }
        }
        //find majority by map travering
        int maxElement=arr[0];
        int maxCount=0;

        for(int key : map.keySet()){
            if(map.get(key) > maxCount){
                maxElement = key;
                maxCount = map.get(key);
            }
        }
        return maxElement;
    }
}