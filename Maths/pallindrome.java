
package Maths;

public class pallindrome {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        long rev=0;
        int temp=x;
        while(temp!=0){
            rev=rev*10+temp%10;
            temp=temp/10;
            if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE){
                return false;
            }
        }
        if((int)rev==x){
            return true;
        }
        else{
            return false;
        }
    }
}
