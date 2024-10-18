package BitManipulation;
public class decimalAndBinary {
    public static String convert2binary(int n){
        String result="";
        int y=n;
        while(y>0){
            int remainder = y%2;
            result=Integer.toString(remainder) + result;
            y=y/2;
        }
        return result;
    }

    public static int convert2decimal(String n){
        int len=n.length();
        int result=0;
        for(int i=len-1;i>=0;i--){
            if(n.charAt(i)=='1'){
                result += (int)Math.pow(2, len-1-i);
            }
        }
        return result;
    }
}
