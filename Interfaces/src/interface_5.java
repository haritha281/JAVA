//5 Create two interfaces with the same method (same signature) in both the interfaces.
//Implement these two interfaces in one class. Call the method.

interface A{
    public void mo1();
}
interface B{
    public void mo1();
}
public class interface_5 implements A,B{
    @Override
    public void mo1(){System.out.println("interface overidden");}
    public static void main(String args[]){  
    interface_5 obj = new interface_5();  
    obj.mo1();  
 } 
}
