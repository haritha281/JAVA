//8.Write a program to find Armstrong number or not
import java.util.*;
public class amstrong {
   public static void main(String[] args)  { 
   Scanner sc= new Scanner(System.in);
   System.out.print("Enter a number\n");
   int n= sc.nextInt();
    int c=0,a,temp;   
    temp=n;  
    while(n>0)  
    {  
    a=n%10;  
    n=n/10;  
    c=c+(a*a*a);  
    }  
    if(temp==c)  
    System.out.println("armstrong number");   
    else  
        System.out.println("Not armstrong number");   
   }   
}
