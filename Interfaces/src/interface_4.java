//4. Create two interfaces with one method each. Implement these two interfaces in one
//class.
interface A{
    public void me1();
}
interface B{
    public void me2();}
public class interface_4 implements A,B{
    public void me1(){System.out.println("interface A");}
    public void me2(){System.out.println("interface B");}
    public static void main(String args[]){  
    interface_4 obj = new interface_4();  
    obj.me1(); obj.me2();  
 } 
}
