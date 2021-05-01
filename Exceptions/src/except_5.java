//5. Write a program to throw exception with your own message
public class except_5 {
    public static void main(String args[])
  {
    int a =10, b = 0, c;
    System.out.println("Hello 1");
    try
    {
      c = a/b;
      System.out.println(c);  
    }
    catch(ArithmeticException e)
    {
      System.out.println("Does not divide by zero(custom message) " );
    }   
  }
}
