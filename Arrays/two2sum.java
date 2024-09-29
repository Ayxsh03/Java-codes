package Arrays;

import java.util.HashMap;

public class two2sum {
    public int[] twoSum(int[] nums, int target){
        
        int prefix[]=new int[nums.length];
        prefix[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }
        
        //HashMap<Integer, Integer> map= new HashMap<>();
        return prefix;
    }
}
