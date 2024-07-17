package Strings;

public class allsubstrings {
    public static void main(String[] args) {
        String str="Ayush";
        int n=str.length();
        /* Using 1st character to print all strings starting from that eg:A,Ay,Ayu,Ayus,Ayugh
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n;j++){
                System.out.println(str.substring(i, j));
            }
        }
        */
        //Using length wise method
        for(int len=1;len<=n;len++){
            for(int start=0;start<=n-len;start++){
                int end=start+len;
                System.out.println(str.substring(start, end));
            }
        }
    }
}
