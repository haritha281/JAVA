//6. Write a program to write text to .txt file using FileWriter
import java.io.FileWriter;  
public class filewriter {  
    public static void main(String args[]){    
         try{    
           FileWriter fw=new FileWriter("C:\\Users\\Haritha Rathnam\\Documents\\JAVA\\testout1.txt");    
           fw.write("Haritha Rathnam");    
           fw.close();    
          }catch(Exception e){System.out.println(e);}    
          System.out.println("Success...");    
     }    
}  
