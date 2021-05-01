//5.Try to call the constructor multiple times with the same object

class const_5 { 
  public const_5() { //constructor1 
   this(true);
   System.out.println("1");
  } 
 public const_5(boolean testFlag) { //constructor2 
 System.out.println("2");
 } 
 public static void main(String[] args) { 
   const_5 t = new const_5(); // calls constructor1 and constructor2 
 }  
}