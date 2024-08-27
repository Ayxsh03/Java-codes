package Patterns;

public class patterns {
    
    public static void p1(int n){
    //* * *
    //* * *
    //* * *
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*"+ " ");
            }
            System.out.println();
        }
    }

    public static void p2(int n){
        //* 
        //* *
        //* * *
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    
    public static void p3(int n){
        //1
        //1 2
        //1 2 3
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void p4(int n){
        //1
        //2 2
        //3 3 3
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    
    public static void p5(int n){
        //* * *
        //* *
        //*
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){ //or j -> i to n
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    public static void p6(int n){
        //1 2 3
        //1 2 
        //1
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void startriangle(int n){
        /* 
        __*__
        _***_
        *****
        */
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
            
    }

    public static void revstartriangle(int n){
        /* 
        *****
        _***_
        __*__
        */
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*(n-i)-1;j++){
                System.out.print("*");
            }
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void stardiamond(int n){
        /*
        *    
       ***   
      *****  
     ******* 
    *********
    *********
     ******* 
      *****  
       ***   
        *    
        */
        //first half
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        //second half
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*(n-i)-1;j++){
                System.out.print("*");
            }
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void rotatedtriangle(int n){
        /*
        *    
        **   
        ***
        **   
        *    
        */
        // //first half
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // //second half
        // for(int i=1;i<n;i++){
        //     for(int j=1;j<n-i+1;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        for(int i=1;i<=2*n-1;i++){
            int stars;
            stars= (i>n) ? (2*n-i) : i;
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void nBinaryTriangle(int n) {
        /*
         1
         0 1
         1 0 1 
        */
        int start=1;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                start=0;
            }
            else{
                start=1;
            }
            for(int j=1;j<=i;j++){
                System.out.print(start);
                start=1-start;
            }
            System.out.println();
        }
    }
    

    public static void main(String[] args) {
        nBinaryTriangle(5);
    }
}
