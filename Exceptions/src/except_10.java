//10. Write a program to generate ClassNotFoundException
public class except_10 {
   public static void main(String args[]) {
        try 
        {
            Class.forName("display");
        }
        catch (ClassNotFoundException ex)
        {
            ex.printStackTrace();
        }
    } 
}
