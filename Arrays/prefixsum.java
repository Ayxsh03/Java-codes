package Arrays;

public class prefixsum {
    public static int[] prefix(int[] arr){

        int[] prefix=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1; i<arr.length; i++){
            prefix[i]=prefix[i-1]+arr[i];
        }

        return prefix;
    }
}
