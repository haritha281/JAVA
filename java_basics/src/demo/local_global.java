//5.Define the local and Global variables with the same name and print both variables
package demo;

public class local_global {
    static int add(){
        int a=4;  //local variables
        int b=6;
        return a+b;
    }
    public static void main(String args[]){
        int a=5;  //global variables
        int b=7;
        int c=a+b; 
        int d=local_global.add();
        System.out.println("from add method: "+d);
        System.out.println("global variables: "+c);
    }
}
