package OOPS2;

public class car extends vehicle{
    int gears;
    boolean isConvertible;

    public car(){
        System.out.println("car constructor");
    }

    public void print(){
        // System.out.println("Color: "+color);
        // System.out.println("Speed: "+getSpeed());
        super.print();
        System.out.println("Gears: "+gears);
        System.out.println("is Convertible: "+isConvertible);
    }
}
