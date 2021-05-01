//6. Use this() and super() in methods not in constructors  
class A{
    int a=10;
    void m(){
    System.out.println("haritha");
}
}
class B extends A{
     int a=30;
     void n(){
     this.m();
     System.out.println("Rathnam");
     System.out.println(a);
     System.out.println(super.a);
     }}
public class this_6 {
    public static void main(String[] args) {
    B obj = new B();
    obj.n();
  }
}
