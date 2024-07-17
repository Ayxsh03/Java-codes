package Strings;

public class reversestr {
    public static void main(String[] args) {
        String str="Ayush Sai";
        String revstr="";
        /*
        for(int i=str.length()-1;i>=0;i--){
            revstr=revstr+str.charAt(i);
        }
        */
        for(int i=0;i<str.length();i++){
            revstr=str.charAt(i)+revstr;
        }
        System.out.println(revstr);
    }
}
