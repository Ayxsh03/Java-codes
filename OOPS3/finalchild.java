package OOPS3;

public class finalchild extends finalparent{
    int gears;
    boolean isConvertible;
    public finalchild(){
        System.out.println("car constructor");
    }

    //public void print(){ //error because cant override the final method from vehicle
    public void print_new(){
        super.print();
        System.out.println("Gears: "+gears);
        System.out.println("is Convertible: "+isConvertible);
    }
}