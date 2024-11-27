package Recursion;

public class quicksort {
    public static void quickSort(int []arr, int si, int ei){
        if(si>=ei){
            return;
        }
        int pivotindex=partition(arr,si,ei);
        quickSort(arr, si, pivotindex-1);
        quickSort(arr, pivotindex+1, ei);
    }

    public static int partition(int[] arr,int si, int ei){
        int pivot=arr[si];
        int count=0;
        for(int i=si+1 ;i<=ei;i++){
            if(arr[i]<=pivot){
                count++;
            }
        }
        int pivotindex=si+count;
        //swap
        int temp=arr[pivotindex];
        arr[pivotindex]=arr[si];
        arr[si]=temp;

        int i=si;
        int j=ei;
        while(i<pivotindex && j>pivotindex){
            if(arr[i]<=pivot){
                i++;
            }
            else if(arr[j]>pivot){
                j--;
            }
            else{
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
        return pivotindex;
    }
    public static void main(String[] args) {
        int [] arr={6,4,7,2,8,2,9};
        quickSort(arr, 0, arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
