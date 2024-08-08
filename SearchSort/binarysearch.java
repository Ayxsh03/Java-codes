package SearchSort;

public class binarysearch {
    public static int binaryIterative(int []arr, int n){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==n){
                return mid;
            }
            else if(arr[mid]<n){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
        
    }

    public static int binaryRecursive(int arr[], int start, int end, int n){
        if(start>end){
            return -1;
        }
        int mid=(start+end)/2;
        if(arr[mid]==n){
            return mid;
        }
        else if(arr[mid]<n){
            return binaryRecursive(arr, mid+1, end, n);
        }
        else{
            return binaryRecursive(arr, start, mid-1, n);
        }
    }

    public static void main(String[] args) {
        int arr[]={5,10,15,20,25,30};
        System.out.println(binaryIterative(arr, 10));
        System.out.println(binaryRecursive(arr, 0, arr.length-1, 10));
    }


}
