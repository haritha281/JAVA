//6. Print all the static, instance variables in main method
public class main_method {
    static int a=20;  //static variable
    int b=50; // instance variable
    public static void main(String args[]) {
    main_method obj = new main_method();
    System.out.println("static variable a= "+ a );
    System.out.println("instance variable b= "+ obj.b );
   }
}
