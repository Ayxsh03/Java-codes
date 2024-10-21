package BitManipulation;

import java.util.Arrays;

public class singlenumber2 {
    public int singleNumber(int[] nums){
        Arrays.sort(nums);
        for(int i=1; i<nums.length; i=i+3){
            if(nums[i]!=nums[i-1]){
                return nums[i-1];
            }
        }
        return nums[nums.length-1]; //last element
    }
    public int singleNumbee2(int[] nums){
        int ones=0, twos=0;
        for(int i: nums){
            ones=(ones^i) & ~twos;
            twos=(twos^i) & ~ones;
        }
        return ones;
    }
}
