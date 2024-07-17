package Strings;

public class stringbuffer {
    public static void main(String[] args) {
        String s="Ayush";
        StringBuffer str=new StringBuffer(s);
        str.setCharAt(0, 'B');
        str.append(" Sai");
        System.out.println(str);
        StringBuffer str1=new StringBuffer("");
        for(int i=0;i<5;i++){
            str1.append((char)('a'+i));
        }
        System.out.println(str1);
    }
}    

