package SearchSort;

public class linearsearch {
    public static int linear(int [] arr, int n){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                return i;
            }
        }
        return -1;
    }
}
//time complexity is O(n)