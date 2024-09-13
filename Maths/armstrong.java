package Maths;
public class armstrong {
    public static boolean ArmstrongNo(int num){
        int count=0;
        int temp=num;
        while(temp>0){
            count++;
            temp/=10;
        }
		long sum=0;
        temp=num;
        
        while(num>0){
            int digit=num%10;
            sum = sum + (int)Math.pow(digit, count);
            num=num/10;
        }
        System.out.println(sum);
        return (temp==sum);
    }

    public static void main(String[] args) {
        int n=1634;
        System.out.println(ArmstrongNo(n));

    }
}
