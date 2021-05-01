//3. Apply private, public, protected and default access modifiers to the constructor
public class const_3 {
    int a;
     private const_3(){
        System.out.println("private method");
    }  
     protected const_3(int x){   
        System.out.println("protected method");
    }   
    public const_3(String s){
             System.out.println("public method");
    }
     public static void main(String[] args) {
    const_3 obj=new const_3();
    const_3 obj1=new const_3(10);
    const_3 obj2=new const_3("Hi");
    System.out.println("default method a="+obj.a);
}
}
