//9. Write a program to read data from properties file.
import java.util.*;  
import java.io.*;  
public class properties {  
public static void main(String[] args)throws Exception{  
    FileReader reader=new FileReader("C:\\Users\\Haritha Rathnam\\Documents\\JAVA\\doc1N.txt");  
      
    Properties p=new Properties();  
    p.load(reader);  
      
    System.out.println(p.getProperty("user"));  
    System.out.println(p.getProperty("password"));  
}  
}  