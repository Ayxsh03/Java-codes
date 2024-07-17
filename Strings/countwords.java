package Strings;

import java.util.Scanner;

public class countwords {
    public static int countWord(String str){
        int count=1;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                count+=1;
            }   
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int n=countWord(str);
        System.out.println(n);
    }
}
