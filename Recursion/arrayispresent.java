package Recursion;

public class arrayispresent {
    public static boolean isPresent(int[] arr, int x){
        if(arr.length==1){
            if(arr[0]==x){
                return true;
            }
            else{
                return false;
            }
        }
        else if(arr[arr.length-1]==x){
            return true;
        }
        int[] ans=new int[arr.length-1];
        for(int i=0;i<arr.length-1;i++){
            ans[i]=arr[i];
        }
        boolean present=isPresent(ans, x);
        return present;

    }
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        System.out.println(isPresent(arr, 5));
    }
    
}
