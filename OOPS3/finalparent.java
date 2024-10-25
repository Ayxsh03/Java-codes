package OOPS3;

public class finalparent {
    protected String color;
    private int speed;

    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public finalparent(){
        System.out.println("Vehicle constructor");
    }
    //Using final in methods
    public final void print(){              
        System.out.println("Speed: "+speed);
        System.out.println("Color: "+color);
    }
}
