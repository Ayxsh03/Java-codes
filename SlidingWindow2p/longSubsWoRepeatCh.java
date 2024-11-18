package SlidingWindow2p;

import java.util.HashMap;

public class longSubsWoRepeatCh {
    public int lengthOfLongestSubstring(String s) {
        int l = 0, r = 0, maxLen = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        while (r < s.length()) {
            char currentChar = s.charAt(r);
            if (map.containsKey(currentChar)) {
                l = Math.max(l, map.get(currentChar) + 1);
            }
            map.put(currentChar, r);
            maxLen = Math.max(maxLen, r - l + 1);
            r++;
        }
        return maxLen;
    }
}
