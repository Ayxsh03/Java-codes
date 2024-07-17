package Strings;

import java.util.Scanner;

public class functions {
    public static void main(String[] args) {
        String str="Ayush";
        System.out.println(str.length());
        System.out.println(str.charAt(0));
        String str1=" ";
        System.out.println(str1.length()); //space length is 1
        String str2="Sai";
        //Concatenation
        str=str+str1+str2;
        System.out.println(str);

        String str3=str.concat(str2);
        System.out.println(str3);

        System.out.println(str2+str1+str3);
        //Compare
        System.out.println(str.equals(str2));

        System.out.println(str.compareTo(str3)); //Returns int-->
        //indicates lexicographic(dictionary) order, it returns difference(ASCII) of 2 strings

        System.out.println(str3.contains("Ayush Sai"));

        //Substrings
        System.out.println(str.substring(4));//start index is inclusive
        System.out.println(str.substring(0, 7)); //end index is exclusive

        //String input
        Scanner sc=new Scanner(System.in);
        //Input-> ab cde fghi jkl
        String s1=sc.next();
        System.out.println(s1+" "+ s1.length());//ab 2
        String s2=sc.next();
        System.out.println(s2+" "+ s2.length());//cd3 3
        String s3=sc.nextLine();
        System.out.println(s3+" "+ s3.length());// fghi jkl 9

    }

}

