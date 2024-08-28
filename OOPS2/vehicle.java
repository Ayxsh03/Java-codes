package OOPS2;

public class vehicle {
    protected String color;
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public vehicle(){
        System.out.println("Vehicle constructor");
    }

    public void print(){
        System.out.println("Speed: "+speed);
        System.out.println("Color: "+color);
    }
}
