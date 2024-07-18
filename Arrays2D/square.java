package Arrays2D;

import java.util.Scanner;

public class square {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int[][] arr=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        if(rows==cols){
            for(int i=0;i<rows;i++){
                System.out.println(arr[i][i]);
            }
        }
        else{
            System.out.println("Matrix is not square");
        }
    }
}
