// 4.Write a program to find the two numbers equal or not.
import java.util.*;
public class eq_or_not {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter first number\n");
        int a= sc.nextInt();
        System.out.print("Enter second number\n");
        int b= sc.nextInt();
        if(a==b)
          System.out.print("given two numbers are equal");
        else
           System.out.print("given two numbers are not equal");
                  
    }
}
