package OOPS1;

public class fractionuse {
    public static void main(String[] args) {
        fraction f1=new fraction(20, 30);
        f1.print();

        f1.setNum(10);
        f1.setDeno(100);
        f1.print();

        fraction f2=new fraction(60, 90);
        f1.add(f2);
        f1.print();


        fraction f3=new fraction(3, 23);
        f1.multiply(f3);
        f1.print();

        fraction f4=fraction.add(f2, f3);
        f4.print();
    }
}
