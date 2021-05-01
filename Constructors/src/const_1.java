/*Write a class with a default constructor, one argument constructor and two argument
constructors. Instantiate the class to call all the constructors of that class from a main
class */
 class ex{
 ex(int x){
 System.out.println("one arg constructor x="+x);
 }
 ex(int x, int y){
 System.out.println("two arg constructor x="+x+" y="+y);
 }
 }
public class const_1 {
    static int a;
    public static void main(String[] args) {
        const_1 obj=new const_1(); //default constructor is called
        System.out.println("a="+a);
        ex obj1=new ex(10);
        ex obj2=new ex(20,30);
    }
}
