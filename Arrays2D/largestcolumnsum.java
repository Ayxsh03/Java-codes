package Arrays2D;

public class largestcolumnsum {
    public static int largecolumnsum(int arr[][]){
        int rows=arr.length;
        int cols=arr[0].length;
        int largest=Integer.MIN_VALUE;
        for(int j=0;j<cols;j++){
            int sum=0;
            for(int i=0;i<rows;i++){
                sum=sum+arr[i][j];
            }
            if(sum>largest){
                largest=sum;
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(largecolumnsum(arr));

    }
}
