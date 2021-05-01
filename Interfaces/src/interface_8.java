/*Create a PUBLIC interface with fields and methods, fields should have values assigned.
Implement this interface to some class and print the values of the interface fields and
call the interface methods*/

public class interface_8 implements example {
     public void m1(){System.out.println("method 1, a="+a);}
    public void m2(){System.out.println("method 2, b="+b);}
     public static void main (String[] args){
        interface_8 ob1 = new interface_8();
        ob1.m1();
        ob1.m2();
    }
}
