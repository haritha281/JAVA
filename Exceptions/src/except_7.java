//7. Write a program with finally block
public class except_7 {
   public static void main(String args[]){  
  try{  
   int data=25/5;  
   System.out.println(data);  
  }  
  catch(NullPointerException e){System.out.println(e);}  
  finally{System.out.println("finally block is always executed");} 
  }  
}
