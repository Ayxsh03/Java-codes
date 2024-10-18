package ArrayAZ;

public class nextpermutation {
    public void nextPermutation(int[] nums) {
        int breakIdx = -1;
        int n = nums.length;
        for (int i = n-2;i>=0;i--){
            if (nums[i] < nums[i+1]){
                breakIdx = i;
                break;
            }
        }

        if (breakIdx == -1){
            // Collections.reverse(Arrays.asList(nums));
            reverseArray(nums,0,n-1);
            return;
        }

        //finding next greater element
        for (int i = n-1;i>breakIdx;i--){
            if (nums[i]>nums[breakIdx]){
                swap(nums,i,breakIdx);
                break;
            }
        }

        //arranging the remaining digits
        reverseArray(nums,breakIdx+1,nums.length-1);
        return;
    }
    public static void reverseArray(int arr[],int start, int end){
         while(start<=end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
