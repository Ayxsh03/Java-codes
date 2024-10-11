package ArrayAZ;

public class sort012 {
    public void dutchnationalflag(int[] arr) {
        int n=arr.length;
        int low = 0, mid = 0, high = n - 1;
        while(mid<=high){
            if(arr[mid]==0){
                int temp=arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;
                low++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;
            }
        }
    }
    
    public void sortColors(int[] arr) {
        int c0=0, c1=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                c0++;
            }
            else{
                c1++;
            }
        }
        for(int i=0;i<c0;i++){
            arr[i]=0;
        }
        for(int i=c0;i<c0+c1;i++){
            arr[i]=1;
        }
        for(int i=c0+c1;i<arr.length;i++){
            arr[i]=2;
        }
    }
}
