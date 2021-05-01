//2. Write a program to write text to .txt file using OutputStream
import java.io.FileOutputStream;  
public class write {  
    public static void main(String args[]){    
           try{    
             FileOutputStream fout=new FileOutputStream("C:\\Users\\Haritha Rathnam\\Documents\\JAVA\\testout.txt");    
             fout.write(66);    
             fout.close();    
             System.out.println("success...");    
            }catch(Exception e){System.out.println(e);}    
      }    
}  