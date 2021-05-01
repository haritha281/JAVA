//2.Print instance variables in static methods
public class inst_in_static {
        int a=10; //instance variable
        static void m1(){
            inst_in_static obj=new inst_in_static();
            System.out.println("Value of a = " + obj.a);  //instance variable in static method
        }
         public static void main(String args[]) {
             inst_in_static.m1();
         }
    
}
