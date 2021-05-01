//3. Create an instance for the child class in child class and call non-abstract methods
abstract class ex{
    abstract void disp();
    public void disp1(){
    System.out.println("this is in class ex, non abstract method");
    }
}

public class abstract_4 extends ex{
    void disp(){System.out.println("this is abstract method");}
    public static void main(String args[]){  
    ex obj=new abstract_4();
    obj.disp1();
}
}