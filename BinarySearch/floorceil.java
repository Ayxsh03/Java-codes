/*Floor of 'x' is the largest element in the array which is smaller than or equal to 'x'.
Ceiling of 'x' is the smallest element in the array greater than or equal to 'x'.    */
package BinarySearch;

import java.util.Arrays;

public class floorceil {
     public int[] getFloorAndCeil(int x, int[] arr) {
        Arrays.sort(arr);
        int ceil=-1, floor=-1;
        int l=0 ,h=arr.length-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(arr[mid]==x){
                ceil=arr[mid];
                floor=arr[mid];
                break;
            }
            if(arr[mid]<x){
                floor=arr[mid];
                l=mid+1;
            }
            else{
                ceil=arr[mid];
                h=mid-1;
            }
        }
        return new int[]{floor, ceil};
    }
}
