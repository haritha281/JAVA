//4. Write a program with multiple catch blocks
public class except_4 {
    public static void main(String[] args) {       
           try{    
                int a=10,b=0,c;    
                c=a/b;    
               }    
               catch(ArithmeticException e)  
                  {  
                   System.out.println("Arithmetic Exception occurs");  
                  }    
               catch(ArrayIndexOutOfBoundsException e)  
                  {  
                   System.out.println("ArrayIndexOutOfBounds Exception occurs");  
                  }    
               catch(Exception e)  
                  {  
                   System.out.println("Parent Exception occurs");  
                  }             
               System.out.println("excecuted successfully");    
    }  
}
