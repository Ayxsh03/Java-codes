/*Find First and Last Position of Element in Sorted Array
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a 
given target value. If target is not found in the array, return [-1, -1]. */
package BinarySearch;

public class elementpostition {
    public int[] searchRange(int[] nums, int target) {
        int lower=lowerbound(nums, target);
        if(lower==nums.length || nums[lower]!=target){
            return new int[]{-1,-1};
        }
        else{
            return new int[]{lower,upperbound(nums, target)-1};
        }
    }
    public static int count(int[] nums, int n, int target) {
        int lower=lowerbound(nums, target);
        if(lower==n || nums[lower]!=target){
            return 0;
        }
        else{
            return upperbound(nums, target)-lower;
        }
    }
    public static int lowerbound(int[] nums, int target){
        int i=0, j=nums.length-1;
        int lowerbound=nums.length;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(nums[mid]>=target){
                lowerbound=mid;
                j=mid-1;
            }
            else{
                i=mid+1;
            }
        }
        return lowerbound;
    }
    public static int upperbound(int[] nums, int target){
        int i=0, j=nums.length-1;
        int upperbound=nums.length;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(nums[mid]>target){
                upperbound=mid;
                j=mid-1;
            }
            else{
                i=mid+1;
            }
        }
        return upperbound;
    }
}
