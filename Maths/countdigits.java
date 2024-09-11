//Count the number of digits in n which evenly divide n. Total number of digits of n which divides n evenly.
//Input: n = 2446 Output: 1 Explanation: Here among 2, 4, 6 only 2 divides 2446 evenly while 4 and 6 do not.

package Maths;
public class countdigits {
    public static int divideN(int n){
        int temp=n;
        int count=0;
        while(temp>0){
            int lastdigit=temp%10;
            if(lastdigit>0 && n%lastdigit==0){
                count=count+1;
            }
            temp=temp/10;
        }
        return count;
    }
}
