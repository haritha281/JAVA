//3. Use Interface instances to call the implemented method in the implemented class

interface A{
int a=10;
public void meth1();
}
public class interface_3 implements A {
    @Override
    public void meth1(){
        System.out.println("a="+a);
    }
    public static void main(String args[]){  
    interface_3 obj = new interface_3();  
    obj.meth1();  
 }  
}  

