package OOPS1;

class Test {
    int a; 
    int b; 
    Test(){   
        this(10, 20);   
        System.out.print("constructor one "); 
    } 
    Test(int a, int b){ 
        this.a = a; 
        this.b = b; 
        System.out.print("constructor two "); 
    } 
}
class new_test{
    public static void main(String[] args){ 
        Test object = new Test(); 
        System.out.println(object.a);
    } 
} 


