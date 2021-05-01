//3. Write a method which throws exception, Call that method in main class without try block
public class except_3 {
    void m1(){
    int a=10, b=0, c;
     System.out.println("Hello");
    c=a/b;
    System.out.println(c);  
    }
    public static void main(String args[])
  {
      except_3 obj=new except_3();
      obj.m1();
  }
}
