/*Suppose an array of length n sorted in ascending order is rotated between 1 and n times. 
For example, the array nums = [0,1,2,4,5,6,7] might become:
[4,5,6,7,0,1,2] if it was rotated 4 times.
[0,1,2,4,5,6,7] if it was rotated 7 times. */
package BinarySearch;

public class mininrotated {
    public int findMin(int[] nums) {
        int n=nums.length;
        int ans=Integer.MAX_VALUE;
        int low=0, high=n-1;
        while(low<=high){             //search space is already sorted then arr[low] will always be
            int mid=low+(high-low)/2; //the minimum in that search space:
            if (nums[low] <= nums[high]) {
                ans = Math.min(ans, nums[low]);
                break;
            }
            if(nums[low]<=nums[mid]){ //sorted part
                ans=Math.min(ans,nums[low]);
                low=mid+1;
            }
            else{
                ans=Math.min(ans,nums[mid]);
                high=mid-1;
            }
        }
        return ans;
    }
}
