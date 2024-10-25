package OOPS3;

public class genericfunc {
    //for int array only
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length ; i++){
            System.out.print(arr[i]+ " "); 
        }
        System.out.println();
    }

    public static <T> void print(T [] arr){
        for(int i = 0; i < arr.length ; i++){
            System.out.print(arr[i]+ " "); 
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer a[]= new Integer[10];
        for(int i=0;i<a.length;i++){
            a[i]=i+1;
        }
        print(a);

        String s[]=new String[5];
        for(int i=0;i<s.length;i++){
            s[i]="abc";
        }
        print(s);

        
    }



}
