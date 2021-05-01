//4.Call instance methods in static methods
public class methods {
   static void staticMethod() {
        methods obj = new methods();
        obj.instanceMethod(); //calling instance method in static method
    }

    void instanceMethod() { 
        System.out.println("This is an instance method");
    }
    public static void main(String args[]) {
        methods.staticMethod();
    }
} 

