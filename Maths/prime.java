package Maths;

public class prime {
    public static boolean isprime(int n){
        int count=0;
        for(int i=1; i*i<=n ;i++){
            if(n%i==0){
                count+=1;
                if(n/i != i){
                    count+=1;
                }
            }
        }
        if(count==2){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        int n=38;
        System.out.println(isprime(n));
    }
}
