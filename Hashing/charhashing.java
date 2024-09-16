package Hashing;
public class charhashing {
    public static void countLowerCase(String s){
        int[] hash = new int[26];  // For 26 lowercase letters a-z
        // Precompute
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {  // Only count lowercase letters
                hash[ch - 'a']++;  // Increment the count at the index corresponding to the letter
            }
        }
        
        // Fetch
        for (int i = 0; i < hash.length; i++) {
            if (hash[i] > 0) {
                // Convert the index back to the corresponding character
                char ch = (char) (i + 'a');
                System.out.println(ch + " occurs " + hash[i] + " times");
            }
        }
    }

    public static void countASCII(String s){
        int[] hash=new int[256];

        for(int i=0; i<s.length();i++){
            char ch=s.charAt(i);
            hash[ch]++;
        }
        for(int i=0; i<hash.length; i++){
            if(hash[i]>0){
                char ch= (char)(i);
                System.out.println(ch+" occurs"+hash[i]+" times");
            }
        }
    }

    public static void countUpperCase(String s){
        int[] hash = new int[26];  // For 26 lowercase letters a-z
        // Precompute
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {  // Only count lowercase letters
                hash[ch - 'A']++;  // Increment the count at the index corresponding to the letter
            }
        }
        // Fetch
        for (int i = 0; i < hash.length; i++) {
            if (hash[i] > 0) {
                // Convert the index back to the corresponding character
                char ch = (char)(i + 'A');
                System.out.println(ch + " occurs " + hash[i] + " times");
            }
        }
    }
    public static void main(String[] args) {
        countLowerCase("abracadabra");
        countUpperCase("SKJVJVOPO");
        //countASCII(" !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~");
    }
}
