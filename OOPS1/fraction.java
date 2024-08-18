package OOPS1;

public class fraction{
    private int numerator;
    private int denominator;

    public fraction(int numerator,int denominator){
        this.numerator=numerator;
        if(denominator==0){
            //TODO error out
        }
        this.denominator=denominator;
        simplify();
    }

    private void simplify(){
        int HCF=1;
        int smaller=Math.min(numerator, denominator);
        for(int i=2;i<=smaller;i++){
            if(numerator%i==0 && denominator%i==0){
                HCF=i;
            }
        }
        numerator=numerator/HCF;
        denominator=denominator/HCF;
    }

    public int getNum(){
        return numerator;
    }

    public int getDeno(){
        return denominator;
    }

    public void setNum(int n){
        this.numerator=n;
        simplify();
    }

    public void setDeno (int n){
        if(n==0){
            return;
        }
        this.denominator=n;
        simplify();
    }
    
    public void print(){
        if(denominator==1){
            System.out.println(numerator);
        }else{
            System.out.println(numerator+"/"+denominator);
        }
    }

    public void add(fraction f2){
        this.numerator=this.numerator*f2.denominator+this.denominator*f2.numerator;
        this.denominator=this.denominator*f2.denominator;
        simplify();
    }

    public void multiply(fraction f2){
        this.numerator *= f2.numerator;
        this.denominator *= f2.denominator;
        simplify();
    }

    public static fraction add(fraction f1, fraction f2){
        int newNum=f1.numerator*f2.denominator+f2.numerator*f1.denominator;
        int newDeno=f1.denominator*f2.denominator;
        fraction f=new fraction(newNum, newDeno);
        return f;
    }
}
