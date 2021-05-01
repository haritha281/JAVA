//1.Write a class with 2 static variables, 2 Instance variables, 2 static methods, 2 instance
//methods and a main method.
public class static_demo {
 static int a=20;  //static variable
 static int b=30;  //static variable
 int x=50; // instance variable
int y=100;  //instance variable
 static void m1() {   //static method
  System.out.println("Value of a = " + a);  
 }
 static void m2(){   //static method
      System.out.println("Value of b = " + b);
 }
 public void inst_m1() //instance method
 {
     System.out.println("Value of x = " + x); 
 }
  public void inst_m2() //instance method
 {
     System.out.println("Value of y = " + y); 
 }
 public static void main(String args[]) {
     static_demo obj=new static_demo();
     static_demo.m1(); //calling static method
     static_demo.m2();
     obj.inst_m1(); //calling instance method
     obj.inst_m2();

 	}
}
