//7.Call static methods and instance methods in main method
public class static_inst_main {
    void instanceMethod() {
      System.out.println("This is an instance method"); 
    }
   static void staticMethod() {
        
           System.out.println("This is a static method"); 
    }  
    public static void main(String args[]) {
        static_inst_main obj=new static_inst_main();
        obj.instanceMethod();
        static_inst_main.staticMethod();
    }
}
