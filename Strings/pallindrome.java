package Strings;
public class pallindrome {
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
