//6. Matching a String Against a Regular Expression With matches()
public class reg {
     public static void main(String args[]) {
      String Str = new String("Hi, this is Haritha Rathnam");
      System.out.print("Does String contains regex (.*)this(.*) ? : " );
      System.out.println(Str.matches("(.*)this(.*)"));
      System.out.print("Does String contains regex Hi ? : " );
      System.out.println(Str.matches("Hi"));
        
   }
}
