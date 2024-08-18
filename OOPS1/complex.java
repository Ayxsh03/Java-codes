package OOPS1;

public class complex {
    private int real;
    private int imaginary;

    public complex(int real,int imaginary){
        this.real=real;
        if(imaginary==0){
            
        }
        this.imaginary=imaginary;
    }
    
    public int getReal(){
        return real;
    }

    public int getImaginary(){
        return imaginary;
    }

    public void setReal(int real){
        this.real=real;
    }

    public void setImaginary(int imaginary){
        if(imaginary==0){
            return;
        }
        this.imaginary=imaginary;
    }

    public void print(){
        System.out.println(real+" + i"+imaginary);
    }

    public void add(complex c2){
        this.real+=c2.real;
        this.imaginary+=c2.imaginary;
    }

    public void multiply(complex c2){
        int newReal=this.real * c2.real - this.imaginary * c2.imaginary;
        int newImaginary=this.real * c2.imaginary + this.imaginary * c2.real;
        this.real=newReal;
        this.imaginary=newImaginary;
    }

    public static complex add(complex c1, complex c2){
        int real=c1.real+c2.real;
        int imaginary=c1.imaginary+c2.imaginary;
        complex c3=new complex(real, imaginary);
        return c3;
    }

    public complex conjugate(){
        this.imaginary=this.imaginary - 2*this.imaginary;
        complex c4=new complex(this.real, this.imaginary);
        return c4;

    }
}
