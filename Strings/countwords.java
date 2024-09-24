package Strings;

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
        String str="jpwep io94334 eioevdnjcv oee e evwe q";
        int n=countWord(str);
        System.out.println(n);
    }
}
