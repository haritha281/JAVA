//11.Write a program to generate FileNotFoundException 
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class except_11
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
        except_11 example = new except_11();
        example.checkFileNotFound();
    }
}


