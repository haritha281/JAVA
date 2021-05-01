/*1. A, B and C are classes. A is a super class. B is a sub class of A. C is a sub class of B.
Create three methods in each class, 2 methods are specific to each class and third
method (override method) should be in all three Classes A, B and C
Create a class with main method. Create an object for each class A, B and C in main
method and call every method of each class using its own object/instance.
Call an overridden method with super class reference to B and C class’s objects
Runtime Polymorphism with Data Members/Instance variables, Repeat the above
process only for data members */

class A{
    void m1(){
        System.out.println("Method 1 of class A");
    }
    void m2(){
        System.out.println("Method 2 of class A");
    }
     void m3(){
        System.out.println("Method 3 of class A");
    }
}
class B extends A{
    //@Override
     void m3(){
        System.out.println("Method 3 of class B");
    }
}
class C extends B{
     void m3(){
        System.out.println("Method 3 of class C");
    }
}
public class inherit{
 public static void main(String args[]){
    A a=new A();
    B b=new B();
    C c=new C();
    a.m1(); a.m2(); a.m3();
    b.m1();b.m2();b.m3();
    c.m1();c.m2();c.m3();
}
}

