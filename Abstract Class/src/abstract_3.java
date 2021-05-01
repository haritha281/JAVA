//3. Create an instance for the child class in child class and call abstract methods
abstract class ex{
    abstract void disp();
    public void disp1(){
    System.out.println("this is in class ex");
    }
}

public class abstract_3 extends ex{
    void disp(){System.out.println("this is abstract method");}
    public static void main(String args[]){  
    ex obj=new abstract_3();
    obj.disp();
}
}