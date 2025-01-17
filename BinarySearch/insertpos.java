/*Given a sorted array of distinct integers and a target value, return the index if the target is found. 
If not, return the index where it would be if it were inserted in order.*/
package BinarySearch;

public class insertpos {
    public int searchInsert(int[] nums, int target) {
        int i=0, j=nums.length-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(target==nums[mid]){
                return mid;
            }
            else if(target>nums[mid]){
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        return i;
    }
}

//Left Index is the answer to this problem.
