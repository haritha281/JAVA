// 1.	How to create a class, object, method and its signature
package demo;
public class Demo1{ //class
int x=7;
static int hello(int a, int b){ //method signature
    return a+b;
}
public static void main(String args[]){
Demo1 obj=new Demo1();//object
System.out.println(Demo1.hello(10,10));
System.out.println(obj.x);
}
}

