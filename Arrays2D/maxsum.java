//For a given two-dimensional integer array/list of size (N x M), you need to find out which row or column 
//has the largest sum

package Arrays2D;

public class maxsum {
    public static int largestcolsum(int arr[][]){
        int rows=arr.length;
        int cols=arr[0].length;
        int largestcol=Integer.MIN_VALUE;
        for(int j=0;j<cols;j++){
            int sum=0;
            for(int i=0;i<rows;i++){
                sum=sum+arr[i][j];
            }
            if(sum>largestcol){
                largestcol=sum;
            }
        }
        return largestcol;
    }
    public static int largestrowsum(int arr[][]){
        int rows=arr.length;
        int cols=arr[0].length;
        int largestrow=Integer.MIN_VALUE;
        for(int i=0;i<rows;i++){
            int sum=0;
            for(int j=0;j<cols;j++){
                sum=sum+arr[i][j];
            }
            if(sum>largestrow){
                largestrow=sum;
            }
        }
        return largestrow;
    }
    //Combined function
	public static void findLargest(int arr[][]){
        boolean isRow = true;
        int largestSum = Integer.MIN_VALUE;
        int rows = arr.length;
        int index = 0;
        int cols= arr[0].length;
        //Program to calculate RowSum
        for(int i=0;i<rows;i++){
            int rowSum = 0;
            for(int j=0;j<cols;j++){
               rowSum = rowSum + arr[i][j];
            }
            if(rowSum>largestSum){
                largestSum = rowSum;
                index = i;
            }
        }
        //Program to calculate ColSum
        for(int j=0;j<cols;j++){
            int colSum = 0;
            for(int i=0;i<rows;i++){
                colSum = colSum + arr[i][j];
            }
            if(colSum>largestSum){
                largestSum = colSum;
                index = j;
                isRow = false; //to show colSum is greater than RowSum
            }
        }
        //Now check which has higher sum row or column
        if(isRow){
            System.out.println("row "+index+ " "+largestSum);
        }else{
            System.out.println("column "+ index+ " "+ largestSum);
        }
    }


    public static void main(String[] args) {
        int arr[][]={{5,6,7},{6,4,9},{8,5,9}};
        int rowsum=largestrowsum(arr);
        int colsum=largestcolsum(arr);
        if(rowsum>colsum){
            System.out.println(rowsum+" row");
        }else{
            System.out.println(colsum+" col");
        }
        findLargest(arr);
    }
}
