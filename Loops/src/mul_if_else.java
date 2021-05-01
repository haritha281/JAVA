//13.Program for multiple if else statement(Largest number in 10,20 and 30)
public class mul_if_else { 
    public static void main(String args[]){
    int x=10, y=20, z=30;
    if(x > y && x > z)
        {
            System.out.println("Largest number is:"+x);
        }
        else if(y > z)
        {
            System.out.println("Largest number is:"+y);
        }
        else
        {
            System.out.println("Largest number is:"+z);
        }
}
}