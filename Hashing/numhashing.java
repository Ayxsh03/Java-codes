package Hashing;

public class numhashing {

    public static void countElements(int[] arr, int max){
        int[] hash=new int[max+1];

        //Precompute
        for (int i : arr) {
            hash[i]++;  // Increment the count at the index corresponding to the element
        }
        
        for (int i = 0; i <= max; i++) {
            if (hash[i] > 0) {
                //fetch
                System.out.println(i + " occurs " + hash[i] + " times.");
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5};
        int max = 5;  // Assuming the largest element in the array is 5
        countElements(arr, max);

        

    }




}

