//9. Write a program to find the prime or not.
import java.util.*;
public class prime {
   public static void main(String args[]){         
  Scanner sc= new Scanner(System.in);
   System.out.print("Enter a number\n");
   int n= sc.nextInt();
   int i,m=0,flag=0; 
     m=n/2;      
  if(n==0||n==1){  
   System.out.println(n+" is not prime number");      
  }else{  
   for(i=2;i<=m;i++){      
    if(n%i==0){      
     System.out.println(n+" is not prime number");      
     flag=1;      
     break;      
    }      
   }      
   if(flag==0)  { System.out.println(n+" is prime number"); }  
  }  
}    
}
