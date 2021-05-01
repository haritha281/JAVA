//17. Write a program to generate StringIndexOutOfBoundsException
public class except_17 {
    public static void main(String[] args) {
      String str = "Hi";
      System.out.println("Length of the String: "+str.length());
      for(int i=0; i<str.length(); i++) {
         System.out.println(str.charAt(i));
      }
      System.out.println(str.charAt(40));
   }
  }

