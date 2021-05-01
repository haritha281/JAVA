//15. Write a program to generate NullPointerException
public class except_15 {
    public static void main (String[] args)
    {
        String ptr = null;
        try
        {
            if ("example".equals(ptr))
                System.out.print("Same");
            else 
                System.out.print("Not Same");            
        }
        catch(NullPointerException e)
        {
            System.out.print("Caught NullPointerException");
        }
    }
}
