package ArrayAZ;

public class secondOrderElements {
    // Optimal Approach O(n)
    public static int[] getSecondOrderElements(int n, int[] a) {
        int[] ans = { -1, -1 };
        if (n <= 1) {
            return ans;
        }
        int max = a[0];
        int min = a[0];
        for (int i = 0; i < n; i++) {
            if (a[i] < min) {
                min = a[i];
            }
            if (a[i] > max) {
                max = a[i];
            }
        }
        int secmax = Integer.MIN_VALUE;
        int secmin = Integer.MAX_VALUE;
        for (int j = 0; j < n; j++) {
            if (a[j] > secmax && max != a[j]) {
                secmax = a[j];
                ans[0] = secmax;
            }
            if (a[j] < secmin && min != a[j]) {
                secmin = a[j];
                ans[1] = secmin;
            }
        }
        return ans;
    }

    // Best Approach O(n) Single Pass
    public static int secondSmallest(int[] arr, int n) {
        if (n < 2) {
            return -1;
        }
        int small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;
        int i;
        for (i = 0; i < n; i++) {
            if (arr[i] < small) {
                second_small = small;
                small = arr[i];
            } else if (arr[i] < second_small && arr[i] != small) {
                second_small = arr[i];
            }
        }
        return second_small;
    }

    public static int secondLargest(int[] arr, int n) {
        if (n < 2)
            return -1;
        int large = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;
        int i;
        for (i = 0; i < n; i++) {
            if (arr[i] > large) {
                second_large = large;
                large = arr[i];
            }
            else if (arr[i] > second_large && arr[i] != large) {
                second_large = arr[i];
            }
        }
        return second_large;
    }
}
