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
            if(x > y){
                x=x%y;
            }
            else{
                y=y%x;
            }
        }
        if(x==0){
            return y;
        }
        else{
            return x;
        }
    }


    


    public static void main(String[] args) {
        System.out.println(hcf2(64, 32));
    }
}
