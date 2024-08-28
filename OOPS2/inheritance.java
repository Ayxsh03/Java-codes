package OOPS2;

public class inheritance {
    public static void main(String[] args) {
        vehicle v=new vehicle();
        v.color="Black";
        v.setSpeed(400);
        v.print();

        System.out.println();

        car c=new car();
        c.color="Blue";
        c.setSpeed(420);
        c.gears=6;
        c.isConvertible=true;
        c.print();
        System.out.println();
        
        //polymorphism
        vehicle v1=new car();
        //boolean ans=v1.isConvertible; ->not possible as no isConvertible is not there in vehicle
        v1.print(); //->print car's print()

    }
}
