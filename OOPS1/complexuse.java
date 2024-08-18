package OOPS1;

public class complexuse {
    public static void main(String[] args) {
        complex c1=new complex(3, 4);
        c1.print();
        c1.setReal(10);
        c1.setImaginary(20);
        c1.print();

        complex c2=new complex(2, 3);
        c1.add(c2);
        c1.print();

        complex c3=new complex(5, 2);
        c2.multiply(c3);
        c2.print();

        complex c4=complex.add(c1, c2);
        c4.print();

        complex c5=c4.conjugate();
        c5.print();
    }
}
