//9. Create a PRIVATE or PROTECTED interface and print the values as above scenario(8)

public class interface_9 {
    private interface disp{
    int x=234;
    public void m1();
    }
    class inner implements disp{
   public void m1(){System.out.println("method 1, x="+x);}}
        
     public static void main (String[] args){
       inner ob1 = new interface_9().new inner();
        ob1.m1();
    } 
}
