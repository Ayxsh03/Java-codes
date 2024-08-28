package OOPS1;

import OOPS2.vehicle;

public class truck extends vehicle {
    int capacity;
    public void print(){
        System.out.println(capacity);
        System.out.println(color); //color not accessible if its not protected
        System.out.println(getSpeed());
    }
}
