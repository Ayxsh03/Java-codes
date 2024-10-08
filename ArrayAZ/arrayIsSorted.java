/*Given an array nums, return true if the array was originally sorted in non-decreasing order, 
then rotated some number of positions (including zero). Otherwise, return false.
There may be duplicates in the original array.
Note: An array A rotated by x positions results in an array B of the same length such that 
A[i] == B[(i+x) % A.length], where % is the modulo operation. */

package ArrayAZ;
public class arrayIsSorted {
    public boolean check(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++)
            if(nums[i]>nums[(i+1)%(nums.length)]){
                count++;
            }
        return count<=1;
    }
}
/*We need to find how many times, the array is breaking the ascending order. If it is breaking just once 
then it or it does't break even once then it is sorted. So we can return true. Otherwise false. */

