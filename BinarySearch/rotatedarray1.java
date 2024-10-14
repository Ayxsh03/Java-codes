/*There is an integer array nums sorted in ascending order (with distinct values).
Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) 
such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]]
(0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
Given the array nums after the possible rotation and an integer target, return the index of target 
if it is in nums, or -1 if it is not in nums. */
package BinarySearch;

public class rotatedarray1 {
    public int searchInRotatedArray1(int[] arr, int target) {
        int n=arr.length;
        int low=0, high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(target==arr[mid]){
                return mid;
            }
            else if(arr[low]<=arr[mid]){ //left part sorted
                if(arr[low]<=target && target<=arr[mid]){ //target is present
                    high=mid-1; //discard right part
                }
                else{
                    low=mid+1;  //discard left part when target is not present
                }
            }
            else{ //right part sorted
                if(arr[mid]<=target && target<=arr[high]){ //target is present
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }
}
