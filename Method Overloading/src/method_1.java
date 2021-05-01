//1. Write two methods with the same name but different number of parameters of same type
//and call the methods from main method

public class method_1 {
    void m1(int a){
      System.out.println("Method 1, a="+a);
    }
    void m1(int a, int b){
       System.out.println("Method 1, a="+a+" b="+b); 
    }
    public static void main(String[] args) { 
       method_1 obj=new method_1(); 
       obj.m1(5);
       obj.m1(10,20);
    }
}
