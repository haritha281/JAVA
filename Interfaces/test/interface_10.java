//10. Create an interface with private, public and protected fields.

public class interface_10 {
    interface disp{
        private int a=10;
        protected int b=20;
        int c=30;
        public void display();   
    }
    class A implements disp{
    public void display(){
    System.out.println("a="+a+" b="+b+" c="+c);
    }
    }
    public static void main (String[] args){
       A ob1 = new interface_10().new A();
        ob1.display(); //compile time error occurs. we cannot create an interface with private and protected feilds
    }
}


