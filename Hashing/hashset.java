package Hashing;

import java.util.HashSet;
import java.util.Iterator;

public class hashset {
    public static void main(String[] args) {
        //Create
        HashSet<Integer> set= new HashSet<>();

        //Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        //Size
        System.out.println(set.size());

        //Print
        System.out.println(set);

        //Travering
        Iterator<Integer> it=set.iterator();
        while(it.hasNext()){
            System.out.println(it.next()+" ");
        }

        //Search
        if(set.contains(1)){
            System.out.println("set contains 1");
        }
        if(!set.contains(6)){
            System.out.println("set doesnt contains 6");
        }

        //Delete
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("set doesnt contains 1");
        }
    }
}
