//2. Write two methods with the same name but different number of parameters of different
//data type and call the methods from main method

public class method_2 {
   void meth1(int a){
      System.out.println("Method 1, a="+a);
    }
    void meth1(int a, String name){
       System.out.println("Method 1, a="+a+" name="+name); 
    }
    public static void main(String[] args) { 
       method_2 obj=new method_2(); 
       obj.meth1(5);
       obj.meth1(10,"Haritha");
    } 
}
