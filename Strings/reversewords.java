/*Reverse the given string word wise. That is, the last word in given string should come at 1st place,
last second word at 2nd place and so on. Individual words should remain as it is.
 */
package Strings;
public class reversewords {
    public static String reverse(String input){
        String reversed=""; 
        int end=input.length();
        for(int i=input.length()-1;i>=0;i--){
            if(input.charAt(i)==' '){
                reversed=reversed+input.substring(i+1, end)+" ";
                end=i;
            }
        }
        reversed=reversed+input.substring(0, end);//For first word
        
        return reversed;
    }
    public static void main(String[] args) {
        String str="Ayush is god";
        str=reverse(str);
        System.out.println(str);
    }
       
}
