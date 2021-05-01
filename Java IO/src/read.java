//1. Write a program to read text from .txt file using InputStream
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
 
class read
{
    public static void main(String[] args)
    {
        File file = new File("C:\\Users\\Haritha Rathnam\\Documents\\JAVA\\doc.txt");
 
        try (InputStream in = new FileInputStream(file))
        {
            int content;
            while ((content = in.read()) != -1) {
                System.out.print((char)content);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}