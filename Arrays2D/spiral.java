package Arrays2D;

import java.util.Scanner;

public class spiral {
    public static int[][] takeInput(){
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int [][]arr=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        return arr;
    }

    public static void printSpiral(int[][] arr){
        if (arr.length == 0){
            System.out.print("");
        }
        int rowst=0;
        int colst=0;
        int rowend=arr.length-1;
        int colend=arr[0].length-1;
        int total=arr.length * arr[0].length;
        int count=0;
        while(count<total){
            //left->right
            for(int i=colst;i<=colend;i++){
                System.out.print(arr[rowst][i]+" ");
                count++;
            }
            rowst++;
            //top->bottom
            for(int i=rowst;i<=rowend;i++){
                System.out.print(arr[i][colend]+" ");
                count++;
            }
            colend--;
            //right->left
            for(int i=colend;i>=colst;i--){
                System.out.print(arr[rowend][i]+" ");
                count++;
            }
            rowend--;
            //bottom->top
            for(int i=rowend;i>=rowst;i--){
                System.out.print(arr[i][colst]+" ");
                count++;
            }
            colst++;
        }

    }
    public static void main(String[] args) {
        int arr[][]=takeInput();
        printSpiral(arr);
    }

    
}
