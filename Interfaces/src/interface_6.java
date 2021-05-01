//6. Create an interface with a default method and implement it in a class. Do not provide
//implementation to the default method and call the method.
interface test{
    default void show(){
    System.out.println("default method called");
    }
}
public class interface_6 implements test{
    public static void main(String args[]){  
        interface_6 obj = new interface_6();  
    obj.show();  
 } 
    
}
