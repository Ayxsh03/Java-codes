package Recursion;

public class mergesort {
    public static void mergeSort(int []arr, int si, int ei){
        //Base case
        if(si>=ei){
            return;
        }
        int mid=(si+ei)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
        merge(arr, si, ei);
    }
    public static void merge(int arr[], int si, int ei){
        int mid=(si+ei)/2;
        int [] ans=new int[ei-si+1];
        int i=si;
        int j=mid+ 1;
        int k=0;
        while(i<=mid && j<=ei){
            if(arr[i]< arr[j]){
                ans[k]=arr[i];
                i++;
                k++;
            }
            else{
                ans[k]=arr[j];
                j++;
                k++;
            }
        }
        while(i<=mid){
            ans[k]=arr[i];
            i++;
            k++;
        }
        while(j<=ei){
            ans[k]=arr[j];
            j++;
            k++;
            
        }

        for(int index=0;index<ans.length;index++){
            arr[index+si]=ans[index];
        }
    }

    public static void main(String[] args) {
        int arr[]={1,5,8,32,6,9,4,0,1};
        mergeSort(arr, 0, arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
