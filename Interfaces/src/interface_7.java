//7. Create an interface and inherit it from the other interface.
interface A{
    void m1();
}  
interface B extends A{
    void m2();
}
class interface_7 implements B{
    @Override
    public void m1()  {
        System.out.println("haritha");
    }
    @Override
    public void m2() {
        System.out.println("Rathnam");
    }
    public static void main (String[] args){
        interface_7 ob1 = new interface_7();
        ob1.m1();
        ob1.m2();
    }
}