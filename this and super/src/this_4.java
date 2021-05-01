//4. Call argument constructor of current class using this()
class A{  
    A(){
    System.out.println("Hello");
    }  
    A(int x){  
    this();  
    System.out.println(x);  
    }  
}  
class this_4{  
public static void main(String args[]){  
A a=new A(10);  
}}  

