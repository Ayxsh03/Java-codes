package SearchSort;

public class bubblesort {
    public static void bubble(int[] arr){
        for(int i=0;i<arr.length-1;i++){ //n-1 rounds
            for(int j=0;j<arr.length-1-i;j++){ //iterating each element of array
                //length- 1 - i because last index at each round if fixed and not swapped
                if(arr[j]>arr[j+1]){      //comparing each adjacent pairs
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={1,6,4,8,9,2,6,4,9,10};
        bubble(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
