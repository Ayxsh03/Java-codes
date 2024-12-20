/*Single Element in a Sorted Array
You are given a sorted array consisting of only integers where every element appears exactly twice, 
except for one element which appears exactly once.
Return the single element that appears only once.*/
package BinarySearch;

public class singlelement {
    public int singleNonDuplicate(int[] arr) {
        int n=arr.length;
        if(n==1) return arr[0];
        if(arr[0]!=arr[1]) return arr[0];
        if(arr[n-1]!=arr[n-2]) return arr[n-1];
        int low=1, high=n-2;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1]){
                return arr[mid];
            }
            if((mid%2==1 && arr[mid]==arr[mid-1]) || (mid%2==0 && arr[mid]==arr[mid+1])){
                low=mid+1;
            }
            else high=mid-1;
        }
        return -1;
    }
}
