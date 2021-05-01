//3. Write two methods with the same name and same number of parameters of same type
//and call from main method

class A{
void run(int x){
    System.out.println("from class A, x="+x);
}
}
class method_3 extends A{
void run(int x){
    System.out.println("from class B, x="+x);
}
public static void main(String[] args) { 
    method_3 obj=new method_3();
    obj.run(5);
}
}