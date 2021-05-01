/*1. Create a class with PRIVATE fields, private method and a main method. Print the fields
in main method. Call the private method in main method.
Create a sub class and try to access the private fields and methods from sub class. */

class A {
    private int a=10;
    private void disp(){
        System.out.println("private int= "+a);
    } 
  public void access(){
  disp();
  }
}  
  public class private_method extends A{
    public static void main(String args[]){
    private_method obj= new private_method();
    obj.access();
    //System.out.println(obj.a);
    }
}
