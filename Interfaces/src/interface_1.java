//1. Create an interface with only one method and implement it in a class. Call the method
//implemented.

interface printable{  
public void print(); 
}  
class interface_1 implements printable{  
@Override
public void print(){System.out.println("Hello");}  
  
public static void main(String args[]){  
interface_1 obj = new interface_1();  
obj.print();  
 }  
}

