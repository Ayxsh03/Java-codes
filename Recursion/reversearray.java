package Recursion;

public class reversearray {
    public int[] reverseArray(int arr[]) {
        // code here
        int start=0, end = arr.length-1, length = arr.length;
        if(length==1) return arr;
        while(start<=end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Recursive method to reverse the array
    public static void reverseArray(int[] arr, int start, int end) {
        // Base case: when start index is greater or equal to end index
        if (start >= end) {
            return;
        }

        // Swap the elements at start and end
        swap(arr, start, end);

        // Recur for the remaining array
        reverseArray(arr, start + 1, end - 1);
    }
}
