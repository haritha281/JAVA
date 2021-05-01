//10.Write a program to check given number is palindrome or not.
import java.util.Scanner;
public class palindrome {
  public static void main(String args[]){    
  Scanner sc= new Scanner(System.in);
   System.out.print("Enter a number\n");
   int n= sc.nextInt();  
    int r,sum=0,temp; 
  temp=n;    
  while(n>0){    
   r=n%10;
   sum=(sum*10)+r;    
   n=n/10;    
  }    
  if(temp==sum)    
   System.out.println("palindrome number ");    
  else    
   System.out.println("not palindrome");    
}  
}
