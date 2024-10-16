package BinarySearch;

public class peak {
    public int findPeakElement(int[] arr) {
        int n=arr.length;
        int low=1, high=n-2;
        if(n==1 || arr[0]>arr[low] ) return 0;
        if(arr[n-1]>arr[high]) return n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(arr[mid]>arr[mid-1]){
                low=mid+1;
            }
            else if(arr[mid]>arr[mid+1]){
                high=mid-1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
}
