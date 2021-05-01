//11. Create an interface with static final variable

interface A{
    static final int a=20;
    void m1();
}
class interface_11 implements A{
    @Override
    public void m1()  {
        System.out.println("a="+a);
    }
    public static void main (String[] args){
        interface_11 ob1 = new interface_11();
        ob1.m1();
    }
}