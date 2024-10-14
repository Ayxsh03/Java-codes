/*Input: s = "anagram", t = "nagaram" => Output: true
Input: s = "rat", t = "car" => Output: false */
package ArrayAZ;

import java.util.Arrays;
import java.util.HashMap;

public class anagram {
    public boolean sAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char[] ss=s.toCharArray();
        char[] tt=t.toCharArray();
        Arrays.sort(ss);
        Arrays.sort(tt);
        return Arrays.equals(ss,tt);
    }

    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (!map.containsKey(ch)) {
                return false;
            }
            map.put(ch, map.get(ch) - 1);
            if (map.get(ch) == 0) {
                map.remove(ch);
            }
        }
        return map.isEmpty();
    }
}