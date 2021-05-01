//2. Handle the Arithmetic exception using try-catch block
public class except_2 {
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
      System.out.println("Does not divide by zero "  + e );
    }
    System.out.println("Hello 2");
  }
}
