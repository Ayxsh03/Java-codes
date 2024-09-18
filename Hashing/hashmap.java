package Hashing;
import java.util.*;

public class hashmap {
    public static void main(String[] args) {
        //Create
        HashMap<String, Integer> map= new HashMap<>();

        //Insert
        map.put("India", 120);
        map.put("China", 150);
        map.put("USA", 100);
        System.out.println(map);

        //Update
        map.put("China", 180);
        System.out.println(map);

        //Size
        System.out.println(map.size());

        //Search
        if(map.containsKey("Japan")){
            System.out.println("key is present");
        }
        else{
            System.out.println("key is absent");
        }
        
        //get
        System.out.println(map.get("India"));
        System.out.println(map.get("Indonesiaa")); //key doesnt exist

        //Iteration
        for (Map.Entry<String,Integer> e : map.entrySet()){
            System.out.print(e.getKey()+" ");
            System.out.print(e.getValue());
            System.out.println();
        }

        //Iteration 2
        Set<String> keys=map.keySet();
        for(String key : keys){
            System.out.println(key + " " + map.get(key));
        }

        //Delete
        map.remove("USA");
        System.out.println(map);


    }
}