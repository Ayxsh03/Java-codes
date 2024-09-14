package Maths;

public class hcfnlcm {
    public static int hcf(int x,int y){
        int hcf=1;
        int min=(x<y) ? x : y;
        for(int i=1;i<=min;i++){
            if(x%i==0 && y%i==0){
                hcf=i;
            }
        }
        return hcf;
    }
    //HCF(a,b)=HCF(a%b,b); a>b Eucliean Algortithm see Strivers video if you dont get it
    public static int hcf2(int x , int y){
        while (x>0 && y>0) {
            if(x > y) x=x%y;
            else y=y%x;
        }
        if(x==0){
            return y;
        }
        else{
            return x;
        }
    }

    public static int lcm(int x,int y){
        return (x/hcf(x, y))* y;
    }

    //Given two integers a and b, write a function lcmAndGcd() to compute their LCM and GCD. The function takes two 
    //integers a and b as input and returns a list containing their LCM and GCD.


    public static Long[] lcmAndGcd(Long a , Long b){
        Long[] arr = new Long[2];
        Long A=a;
        Long B=b;
        while(A>0 && B>0){
            if(A>B) A=A%B;
            else B=B%A;
        }
        Long HCF = (A==0)?B:A;
        Long LCM = (a/HCF)*b;
        arr[0]=LCM;
        arr[1]=HCF;
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(hcf2(64, 32));
        System.out.println(lcm(14, 8));
    }
}
