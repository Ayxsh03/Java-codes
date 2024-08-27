package Patterns;

public class patterns2 {
    
    public static void numberCrown(int n){
        /*
        1      1
        12    21
        123  321
        12344321
         */
        int space=2*(n-1);
        for(int i=1;i<=n;i++){
            //numbers
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            //space
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            //numbers
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
            space-=2;
        }
    }
    
    public static void incNumTriangle(int n){
        /*
        1 
        2 3 
        4 5 6 
        7 8 9 10 
        11 12 13 14 15 
        */
        int count=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                count++;
                System.out.print(count+" ");
            }
            System.out.println();
        }
    }
    
    public static void letterTriangle(int n){
        /*
        A 
        A B 
        A B C 
        A B C D 
        */
        for(int i=0;i<n;i++){
            for(char c='A';c<='A'+i;c++){
                System.out.print(c+" ");
            }
            System.out.println();
        }
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<=i;j++){
        //         char c='A';
        //         System.out.print((char)(c+j)+" ");
        //     }
        //     System.out.println();
        // }
    }

    public static void revLetterTriangle(int n){
        /*
        A B C D
        A B C
        A B
        A
        */
        for(int i=0;i<n;i++){
            for(char c='A'; c<='A'+(n-i-1);c++){
                System.out.print(c+" ");
            }
            System.out.println();
        }
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n-i;j++){
        //         char c='A';
        //         System.out.print((char)(c+j)+" ");
        //     }
        //     System.out.println();
        // }
    }

    public static void alpharamp(int n){ 
        /*
        A 
        B B 
        C C C 
        D D D D 
        E E E E E 
        */
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                char c='A';
                System.out.print((char)(c+i)+" ");
            }
            System.out.println();
        }
    }
    
    public static void alphahill(int n){
        /*
           A   
          ABA  
         ABCBA 
        ABCDCBA
        */
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            char c='A';
            int breakpoint=(2*i+1)/2;
            for(int j=0;j<2*i+1;j++){
                System.out.print(c);
                if(j<breakpoint){
                    c++;
                }
                else{
                    c--;
                }
            }
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void alphatriangle(int n){
        /*
        E 
        E D 
        E D C 
        E D C B 
        E D C B A 
        */
        for(int i=0;i<n;i++){
            char ch=(char)('A'+n-1);
            for(int j=0;j<=i;j++){
                System.out.print(ch-- + " ");
            }
            System.out.println();
        }
    }

    public static void alphatriangle2(int n){
        /*
        E 
        D E 
        C D E 
        B C D E 
        A B C D E 
        */
        for(int i=0;i<n;i++){
            for(char c=(char)('A'+n-i-1);c<(char)('A'+n);c++){
                System.out.print(c+" ");
            }
            /*
            A 
            B A 
            C B A 
            D C B A 
            E D C B A 
            for(char ch=(char)('A'+i);ch>='A';ch--){
                System.out.print(ch+" ");
            }
            */
            System.out.println();
        }
    }
    
    public static void symmetricVoid(int n){
        /*
        **********
        ****  ****
        ***    ***
        **      **
        *        *
        *        *
        **      **
        ***    ***
        ****  ****
        **********
        */
        int spaces=0;
        for(int i=0;i<n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("*");
            }
            for(int j=0;j<spaces;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n-i;j++){
                System.out.print("*");
            }
            spaces=spaces+2;
            System.out.println();
        }
        int space2=2*(n-1);
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=0;j<space2;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            space2=space2-2;
            System.out.println();
        }
    }
    
    public static void symmetry(int n){
        /*
        *         * 
        * *     * * 
        * * * * * * 
        * *     * * 
        *         * 
        */
        int space=2*n-2;
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            for(int j=0;j<space;j++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            space-=2;
            System.out.println();
        }
        int space2=2;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print("*");
            }
            for(int j=0;j<space2;j++){
                System.out.print(" ");
            }
            for(int j=0;j<n-i-1;j++){
                System.out.print("*");
            }
            space2+=2;
            System.out.println();
        }
    }

    public static void symmetry2(int n){
        /*
        *         * 
        * *     * * 
        * * * * * * 
        * *     * * 
        *         * 
        */
        int sp=2*n-2;
        for(int i=1;i<=2*n-1;i++){
            int stars;
            stars=(i>n) ? 2*n-i : i;
            //stars
            for(int j=0;j<stars;j++){
                System.out.print("*");
            }
            //space
            for(int j=0;j<sp;j++){
                System.out.print(" ");
            }
            for(int j=0;j<stars;j++){
                System.out.print("*");
            }
            if(i<n){
                sp-=2;
            }
            else{
                sp+=2;
            }
            System.out.println();
        }
    }

    public static void square(int n){
        /*
        * * * * * 
        *       * 
        *       * 
        *       * 
        * * * * * 
        */
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || i==n-1 || j==0 || j==n-1){
                    System.out.print("*"+" ");
                }
                else{
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }
        // for(int i=0;i<n;i++){
        //     if(i==0 || i==n-1){
        //         for(int j=0;j<n;j++){
        //             System.out.print("*");
        //         }
        //     }
        //     else{
        //         for(int j=0;j<n;j++){
        //             if(j==0 || j==n-1){
        //                 System.out.print("*");
        //             }
        //             else{
        //                 System.out.print(" ");
        //             }
                    
        //         }
        //     }
        //     System.out.println();
        // }
    }
    public static void main(String[] args) {
        incNumTriangle(5);
    }
}
