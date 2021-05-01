//5. Write two methods with the same name, number of parameters and data type but
//different return Type.

public class method_5 {
int m1(int a){
      return a;
    }
  void m1(int a, int b){
       System.out.println("Method 1, a="+a+" b="+b); 
    }
    public static void main(String[] args) { 
       method_5 obj=new method_5(); 
       int x=obj.m1(5);
       System.out.println("x="+x);
       obj.m1(10,20);
    }
}
