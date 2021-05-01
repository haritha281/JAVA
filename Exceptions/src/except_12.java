//12. Write a program to generate IOException
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class except_12
{
    public void checkFileNotFound()
    {
        try
        {
            FileInputStream in = new FileInputStream("input.txt");
            System.out.println("This is not printed");
        } 
        catch (FileNotFoundException fileNotFoundException)
        {
            fileNotFoundException.printStackTrace();
        }
    }
    public static void main(String[] args)
    {
        except_12 example = new except_12();
        example.checkFileNotFound();
    }
}