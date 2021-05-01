// 4.Write a program to print the odd and even numbers.
import java.util.*;
public class even_odd {
     public static void main(String args[]){
         Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number\n");
        int a= sc.nextInt();
        if(a%2==0)
          System.out.print(a+" is an even number");
        else 
            System.out.print(a+" is an odd number");
     } 
}
