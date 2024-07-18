package Arrays2D;

public class rowtraversal {
    //Row wise traversal
    public static void printRowWise(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
        }
    }
    //Method using array as return
    public static int[] printRowWis(int arr[][]){
        int rows=arr.length;
        int cols=arr[0].length;
        int ans[]=new int[rows * cols];
        //int index=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                ans[i * rows + j]=arr[i][j]; //ith cell in row and jth col
              //ans[index++]=arr[i][j];  //Easy
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int [][]arr={{1,2,7},{2,3,8},{3,4,9}};
        //method1
        printRowWis(arr);
        
        //method2
        int []ans=printRowWis(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
