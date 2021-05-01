//5. Call static methods in instance methods
public class method {
    void instanceMethod() {
        method obj = new method();
        obj.staticMethod(); //calling static method in instance method
    }
   static void staticMethod() {
        
           System.out.println("This is a static method"); 
    }  
    public static void main(String args[]) {
        method.staticMethod();
    }
} 
