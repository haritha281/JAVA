// 1. Create an abstract class with abstract and non-abstract methods.

abstract class A{
    abstract void m1();
    public void m2(){
        System.out.println("non abstract method");
    }
}
class B extends A{
    void m1(){System.out.println("abstract method");}
}
public class abstract_2 {
    public static void main(String args[]){  
        A obj = new B();
        obj.m1();
        obj.m2();
    }
}
