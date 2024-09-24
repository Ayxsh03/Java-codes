package Hashing;

import java.util.HashMap;

public class itinerary {

    public static String getStart(HashMap<String,String> map){
        HashMap<String,String> reverse = new HashMap<>();

        for(String keys: map.keySet()){
            //key->key, val->map.get(key) //reverse this
            reverse.put(map.get(keys), keys);
        }

        for(String keys: map.keySet()){
            if(!reverse.containsKey(keys)){
                return keys;
            }
        }
        return null;
    }
    public static void main(String[] args){

        HashMap<String,String> tickets = new HashMap<>();

        tickets.put("Chennai", "Banglore");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        String start=getStart(tickets);

        while(tickets.containsKey(start)){
            System.out.print(start+" -> ");
            start = tickets.get(start);
        }
        System.out.println(start);
    }
}
