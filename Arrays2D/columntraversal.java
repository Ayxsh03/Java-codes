package Arrays2D;

public class columntraversal {
    //Column wise traversal
    public static void printColWise(int[][] arr){
        int rows=arr.length;
        int cols=arr[0].length;
        for(int j=0;j<cols;j++){
            for(int i=0;i<rows;i++){
                System.out.print(arr[i][j]+" ");
            }
        }
    }

    //Method using array as return
    public static int[] printCol(int[][] arr){
        int rows=arr.length;
        int cols=arr[0].length;
        int ans[]=new int[rows * cols];
        //int index=0;
        for(int j=0;j<cols;j++){
            for(int i=0;i<rows;i++){
                ans[i + j * cols]=arr[i][j];//jth cell in col of ith row
              //ans[index++]=arr[l][k];     //Easier
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int [][]arr={{1,2,7},{2,3,8},{3,4,9}};
        //method1
        printColWise(arr);

        System.out.println();
        //method2
        int[] ans=printCol(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
