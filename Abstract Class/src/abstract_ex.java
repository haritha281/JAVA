//2. Create a sub class for an abstract class. Create an object in the child class for the
//abstract class and access the non-abstract methods

abstract class A{ //abstract class
    abstract void m1(); //abstract method
    public void m2(){ //non abstract method
    System.out.println("non abstract method");
    }
}
public class abstract_ex extends A{
    void m1(){System.out.println("abstract method");}
    public static void main(String args[]){  
        A obj=new abstract_ex();
        obj.m1();
        obj.m2();
}
}
