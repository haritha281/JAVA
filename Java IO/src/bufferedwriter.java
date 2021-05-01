//8. Write text to a .txt file using BufferedWriter  
import java.io.*;  
public class bufferedwriter {  
public static void main(String[] args) throws Exception {     
    FileWriter writer = new FileWriter("C:\\Users\\Haritha Rathnam\\Documents\\JAVA\\doc1.txt");  
    BufferedWriter buffer = new BufferedWriter(writer);  
    buffer.write("writing using buffered writer");  
    buffer.close();  
    System.out.println("Success");  
    }  
}  