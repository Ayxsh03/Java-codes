package OOPS3;

public class pairuse {
    public static void main(String[] args) {
        genericPair<String> p1= new genericPair<String>("Ayush","Sai");       
        p1.setFirst("AYUSH");
        System.out.println(p1.getFirst());

        /*genericPair p2=new genericPair(1, 2); 
        this is problematic and we wont use it as such
        p2.setFirst("abc"); */

        //genericPair<int> p2=new genericPair<int>(1, 2);//error because int is primitive and not objects subclass
        genericPair<Integer> p2=new genericPair<Integer>(1, 2);
        p2.setSecond(10);
        System.out.println(p2.getSecond());

        genericpair2 <String, Integer> p3=new genericpair2<String,Integer>("Sai", 2003);
        p3.setFirst("SAI");
        System.out.println(p3.getSecond());

        genericpair2 <String, String> p4=new genericpair2<>("Sai", "OP");
        p3.setFirst("SAI");
        System.out.println(p4.getSecond());

        //3 integers using pair2
        int a=10;
        int b=15;
        int c=20;
        genericpair2 <Integer,Integer> internalPair=new genericpair2<>(a,b);
        genericpair2 <genericpair2<Integer,Integer>, Integer> Triplet=new genericpair2<>(internalPair, c);
        //get elements of a, b, c
        System.out.println(Triplet.getFirst().getFirst());
        System.out.println(Triplet.getFirst().getSecond());
        System.out.println(Triplet.getSecond());

    }
}
