package ArrayAZ;

public class rotateByK {

    public static int[] rotateLeftByK(int[] nums, int n, int k){
        if (n == 0)
            return nums;
        k=k%n;
        //Copy k elements in temp
        int[] temp=new int[k];
        for(int i=0;i<k;i++){
            temp[i]=nums[i];
        }
        //Shifting
        for(int i=k;i<n;i++){
            nums[i-k]=nums[i];
        }
        //Put back
        for(int i=n-k;i<n;i++){
            nums[i]=temp[i-(n-k)];
        }
        return nums;
    }

    public static int[] rotateRightByK(int[] nums, int n, int k){
        if (n == 0)
            return nums;
        k=k%n;
        //Copy last k elements in temp
        int[] temp=new int[k];
        for(int i=n-k;i<k;i++){
            temp[i-(n-k)]=nums[i];
        }
        //Shifting
        for(int i=n-k-1;i>=0;i--){
            nums[i+k]=nums[i];
        }
        //Put back
        for(int i=k;i<n;i++){
            nums[i]=temp[i];
        }
        return nums;
    }

    public static void reverse(int[] nums, int start, int end){
        while(start<=end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
    public static void rotateLeftK(int[] nums, int n, int k){
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);
        reverse(nums, 0, n-1);
    }

    public static void rotateRightK(int[] nums, int n, int k){
        reverse(nums, 0, n-k-1);
        reverse(nums, n-k, n-1);
        reverse(nums, 0, n-1);
    }

}
