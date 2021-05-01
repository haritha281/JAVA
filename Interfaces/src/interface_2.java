//2. Create an interface with two methods, but implement only one in a class. Call the
//method implemented.

interface printable{  
void print(); 
void print1();
}  
class interface_2 implements printable{  
@Override
public void print(){System.out.println("Hello");}
@Override
public void print1(){System.out.println("hi ");}  
public static void main(String args[]){  
interface_2 obj = new interface_2();  
obj.print();  
 }  
}  