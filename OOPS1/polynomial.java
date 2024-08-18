package OOPS1;

public class polynomial {
    
    private dynamicarray coefficients;

    public polynomial(){
        coefficients=new dynamicarray();
    }

    public void setCoefficient(int degree,int coefficient){
        if(degree<0){
            return;
        }
        while(degree>coefficients.size()){
            coefficients.add(0);
        }
        coefficients.set(degree,coefficient);
    }

    public int getCoefficient(int degree){
        return coefficients.get(degree);
    }

    public int degree(){
        return coefficients.size();
    }

    public void add(polynomial p){
        for(int i=0;i <= p.degree();i++){
            this.setCoefficient(i, this.coefficients.get(i)+p.coefficients.get(i));
        }

        // int maxDegree=Math.max(this.coefficients.size(), p.coefficients.size());
        // for(int i=0;i<=maxDegree;i++){
        //     int thiscoeff=(i<this.coefficients.size()) ? this.coefficients.get(i) : 0;
        //     /*If i is less than the size of the coefficients array of the current polynomial,
        //     it fetches the coefficient at degree i. If i is greater than or equal to the size,it means the
        //     polynomial does not have a term of degree i, so the coefficient is considered 0.*/
        //     int pcoeff=(i<p.coefficients.size()) ? p.coefficients.get(i) : 0;
        //     this.setCoefficient(i, thiscoeff+pcoeff);
        }
    
    public void subtract(polynomial p){
        for(int i=0;i <= p.degree();i++){
            this.setCoefficient(i, this.coefficients.get(i)-p.coefficients.get(i));
        }
    }
    public static polynomial add(polynomial p1,polynomial p2){
        polynomial p=new polynomial();
        for(int i=0;i<=p1.degree();i++){
            p.setCoefficient(i, p1.getCoefficient(i)+p2.getCoefficient(i));
        }
        return p;
    }

    public void print(){
        for(int i=0;i<=coefficients.size();i++){
            System.out.print(coefficients.get(i)+"x^"+i);
        }
    }

    // public polynomial multiply(polynomial p){
    //     polynomial result=new polynomial();
    //     for(int i=0;i <= p.degree();i++){

    //     }
    //}
}
