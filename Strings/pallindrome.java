/* A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alpha
numeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers. */

package Strings;

public class pallindrome {

    public static boolean isPalindrome(String s){
        s=s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        s=s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str="deed";
        int mid=str.length()/2;
        boolean ispallindrome=false;
        for(int i=0;i<=mid;i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                ispallindrome=false;
                break;
            }else{
                ispallindrome=true;
            }
        }
        if(ispallindrome==true){
            System.out.println("String is a pallindrome");
        }else{
            System.out.println("String is not a pallindrome");
        }
        //Method 2--> find reverse string and check if they are equal
    }
}
