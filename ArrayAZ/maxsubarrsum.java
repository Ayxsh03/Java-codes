package ArrayAZ;

public class maxsubarrsum {
    public int kadanesalgo(int[] arr) {
        int max=Integer.MIN_VALUE;
        int n=arr.length;
        int start = 0;
        int ansStart = -1, ansEnd = -1;
        int sum=0;
        for (int i = 0; i < n; i++) {
            if (sum == 0) start = i;
            sum += arr[i];
            if (sum > max) {
                max = sum;
                ansStart = start;
                ansEnd = i;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        //Print subarray
        for (int i = ansStart; i <= ansEnd; i++) {
            System.out.print(arr[i] + " ");
        }

        return max;
    }
}
