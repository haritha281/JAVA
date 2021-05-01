//3. Read text from a .txt file using BufferedInputStream
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
 
public class buffered_read {
 
    public static void main(String a[]){
        InputStream is;
        BufferedInputStream bis;
        DataInputStream dis ;
         try {
            is = new FileInputStream("C:\\Users\\Haritha Rathnam\\Documents\\JAVA\\doc.txt");
            bis = new BufferedInputStream(is);
            dis = new DataInputStream(bis);
            String temp;
            while((temp = dis.readLine()) != null){
                System.out.println(temp);
            }
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        }
}
}