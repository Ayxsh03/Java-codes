package Hashing;
import java.util.HashMap;

public class subarraysumK {

    public static int sumK(int[] arr, int k){
        HashMap<Integer,Integer> map = new HashMap<>(); //<Sum, Freq>
        map.put(0, 1); //Empty subarray
        int ans=0;
        int sum=0;
        for(int j=0;j<arr.length;j++){
            sum+=arr[j];
            if(map.containsKey(sum-k)){
                ans+=map.get(ans-k);
            }
            if(map.containsKey(sum)){
                map.put(sum, map.get(sum)+1);
            }
            else{
                map.put(sum, 1);
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int arr[] = {10 , 2, -2, -20, 10};
        System.out.println(sumK(arr, -10));
    }
}
