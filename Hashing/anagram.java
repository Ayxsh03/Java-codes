package Hashing;

import java.util.HashMap;

public class anagram {
    public boolean isAnagram(String s, String t) {
       
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            /*
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch))+1);
            }
            else{
                map.put(ch,1);
            }*/
        }
        // Subtract the frequency of characters in string t
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (!map.containsKey(ch)) {
                return false; // If character not found in the map, they are not anagrams
            }
            map.put(ch, map.get(ch) - 1);
            if (map.get(ch) == 0) {
                map.remove(ch); // Remove character if its frequency becomes zero
            }
        }
        return map.isEmpty();

        /* char []str1 = s.toCharArray();
        char []str2 = t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        
        boolean test = false;
       test= Arrays.equals(str1,str2);
        return test; */
    }
}
