/*There is an integer array nums sorted in non-decreasing order (not necessarily with distinct values).
Before being passed to your function, nums is rotated at an unknown pivot index k (0 <= k < nums.length) such that 
the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). 
arr [1,0,1,1,1] target = 0 Output= true */
package BinarySearch;

public class rotatedarray2 {
    public boolean searchInRotatedArray2(int[] arr, int target) {
        int n=arr.length;
        int low=0, high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(target==arr[mid]){
                return true;
            }
            if (arr[low] == arr[mid] && arr[mid] == arr[high]) {
                low = low + 1;
                high = high - 1;
                continue;
            }
            if(arr[low]<=arr[mid]){ //left part sorted
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
        return false;
    }
}
