/*Reverse the given string word wise. That is, the last word in given string should come at 1st place,
last second word at 2nd place and so on. Individual words should remain as it is.

Psedocode
Function reverseStringWordWise (input) :
    Initialize previndex as -1, i as 0
    While input [i] != `\O': //special character at the end of each string
        If input (1) == ' ':
            reverse (input, prevIndex + 1, i - 1) // Reverse the word between prevIndex and i-1
            Set prevIndex to i
        Increment i
    Call reverse (input, prevIndex + 1, i - 1) // Reverse the last word
    Call reverse (input, 0, i - 1) // Reverse the entire string
Function reverse (input, start, end):
    While start < end:
        Swap input[start] with input [end]
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
        reversed=reversed+input.substring(0, end);
        
        return reversed;
    }
    public static void main(String[] args) {
        String str="Ayush is god";
        str=reverse(str);
        System.out.println(str);
    }
       
}
