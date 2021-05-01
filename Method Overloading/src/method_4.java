//4. Write two methods with the same name and same number of parameters of different
//type and call from main method
public class method_4 {
 void m1(int a, String name){
      System.out.println("Method 1, a="+a+" name="+name);
    }
    void m1(String name, int a){
       System.out.println("Method 1, name="+name+" a="+a); 
    }
    public static void main(String[] args) { 
       method_4 obj=new method_4(); 
       obj.m1(5, "haritha");
       obj.m1("rathnam",20);
    }   
}

