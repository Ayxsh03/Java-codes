/*Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4] */

package ArrayAZ;
public class rotateByOne {
    public static int[] rotateLeftByOne(int[] nums, int n) { //n is size
        int[] b=new int[n];
        for(int i=0;i<n;i++){
            b[i]=nums[(i+n+1)%n];
        }
        return b;
    }
    public static int[] rotateRightByOne(int[] nums, int n) { //n is size
        int[] b=new int[n];
        for(int i=0;i<n;i++){
            b[i]=nums[(i+n-1)%n];
        }
        return b;
    }

    //OPTIMUM SOLUTION
    public static int[] rotateArrayLeft(int[] arr, int n) {
        int temp=arr[0];
        for(int i=1;i<n;i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
        return arr;
    }

    public static int[] rotateArrayRight(int[] arr, int n) {
        int temp=arr[n-1];
        for(int i=n-1;i>=1;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
        return arr;
    }

    

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        arr=rotateArrayRight(arr, 5);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        arr=rotateArrayLeft(arr, 5);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
