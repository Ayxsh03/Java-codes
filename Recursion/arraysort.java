package Recursion;

public class arraysort {
    
    public static boolean isSorted(int []arr){
        if(arr.length<=1){
            return true;
        }
        int []smallarr=new int[arr.length-1]; //creating a new array with 1 less element
        for(int i=1;i<arr.length;i++){
            smallarr[i-1]=arr[i];
        }
        boolean b=isSorted(smallarr);//checking for sorted
        if(!b){
            return false;           //array not sorted
        }
        else{
            if(arr[0]<=arr[1]){
                return true;        //1st and 2nd element for comparison
            }
            else{
                return false;
            }
        }
    }
    public static boolean isSorted_2(int []arr){
        if(arr.length<=1){
            return true;
        }
        if(arr[0]>arr[1]){
            return false;
        }
        int []smallarr=new int[arr.length-1]; //creating a new array with 1 less element
        for(int i=1;i<arr.length;i++){
            smallarr[i-1]=arr[i];
        }
        boolean b=isSorted(smallarr);//checking for sorted
        if(!b){
            return false;           //array not sorted
        }
        if(arr[0]<=arr[1]){
            return true;        //1st and 2nd element for comparison
        }
        else{
            return false;
        }
    }
    //Helper Function
    private static boolean betterSort(int []arr, int startIndex){
        if(startIndex >= arr.length-1){
            return true;
        }
        if(arr[startIndex] > arr[startIndex+1]){
            return false;
        }
        boolean b= betterSort(arr, startIndex+1);
        return b;

    }
    //User doesnt need to know or input the start index, they only want true or false
    //Function Overloading
    public static boolean betterSort(int []arr){
        return betterSort(arr, 0);
    }
    public static void main(String[] args) {
        int arr[]={1 , 2 , 3 , 6 , 9};
        System.out.println(isSorted(arr));
        System.out.println(isSorted_2(arr));
        System.out.println(betterSort(arr));
    }
    
}
