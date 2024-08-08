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

    //Stackoverflow
    public void selectionSort(int a[], int n) 
    {
      recurSelectionSort(a, n, 0);
    }

    // Recursive selection sort. n is size of a[] and index
    // is index of starting element.
    static void recurSelectionSort(int a[], int n, int index)
    {
          
        // Return when starting and size are same
        if (index == n)
           return;
      
        // calling minimum index function for minimum index
        int k = minIndex(a, index, n-1);
      
        // Swapping when index nd minimum index are not same
        if (k != index){
           // swap
           int temp = a[k];
           a[k] = a[index];
           a[index] = temp;
        }
        // Recursively calling selection sort function
        recurSelectionSort(a, n, index + 1);
    }

    // Return minimum index
    static int minIndex(int a[], int i, int j)
    {
        if (i == j)
            return i;
  
        // Find minimum of remaining elements
        int k = minIndex(a, i + 1, j);
  
        // Return minimum of current and remaining.
        return (a[i] < a[k])? i : k;
    }
}