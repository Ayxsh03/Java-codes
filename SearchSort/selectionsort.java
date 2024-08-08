package SearchSort;

public class selectionsort {
    public static void selection(int[] arr){
        for(int i=0;i<arr.length-1;i++){ //n-1 rounds or 0 to len-2 iterations
            int min=arr[i];
            int minIndex=i;
            for(int j=i+1;j<arr.length;j++){ //Search remaining arr for minimum element
                if(arr[j]<min){              //and updating it
                    min=arr[j];
                    minIndex=j;
                }
            }
            if(minIndex != i){           //if minimum is found i.e. initial arr[i] is not minimum
                //swap
                int temp=arr[i];            
                arr[i]=min;
                arr[minIndex]=temp; 
            }
            
        }
    }
    public static void main(String[] args) {
        int arr[]={1,6,4,8,9,2,6,4,9,10};
        selection(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}