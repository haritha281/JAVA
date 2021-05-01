//3.Print static variables in Instance methods
public class static_in_inst {
    static int a=10; //static variable
    public void m1(){
        System.out.println("Value of a = " + a); //static variable in instance method
    }
    public static void main(String args[]) {
             static_in_inst obj=new static_in_inst() ;
             obj.m1();
         }
}
