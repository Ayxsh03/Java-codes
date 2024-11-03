package Recursion;

public class printN {
    public static void printNto1(int n){
        if(n==0) return;
        System.out.println(n);
        printNto1(n-1);
    }
    public static void print1toN(int n){
        if(n==0) return;
        print1toN(n-1);
        System.out.println(n);
    }
    public static int printSumN(int n){
        if(n==0) return 0;
        return n + printSumN(n-1);
    }
    public static int factorial(int n){
        if(n==0) return 1;
        return n * factorial(n-1);
    }
    public static int fibonacci(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void fibonacciN(int n){
        for(int i=0;i<=n;i++){
            System.out.println(fibonacci(i)+" ");
        }
        System.out.println();
    }
    public static int pow(int x, int n){
        if(n==0) return 1;
        return x * pow(x, n-1);
    }
    //optimized o(log n)
    public static int power(int x, int n) {
        if (x==0) return 0;
        if (n == 0) return 1;
        int half = pow(x, n / 2);
        if (n % 2 == 0) {
            return half * half;
        } else {
            return x * half * half;
        }
    }


}
