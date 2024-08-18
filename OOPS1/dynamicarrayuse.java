package OOPS1;

public class dynamicarrayuse {
    public static void main(String[] args) {
        dynamicarray data=new dynamicarray();
        for(int i=0;i<100;i++){
            data.add(i+10);
        }
        System.out.println(data.size());

        data.set(4,10);
        System.out.println(data.get(3));
        System.out.println(data.get(4));

        while(!data.isEmpty()){
            System.out.println(data.removeLast());
            System.out.println("size="+data.size());
        }
    }
    
}
