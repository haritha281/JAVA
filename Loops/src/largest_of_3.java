// 5.Write a program to print largest number among three numbers.
import java.util.*;
public class largest_of_3 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter first number\n");
        int x= sc.nextInt();
        System.out.print("Enter second number\n");
        int y= sc.nextInt();
        System.out.print("Enter third number\n");
        int z= sc.nextInt();
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