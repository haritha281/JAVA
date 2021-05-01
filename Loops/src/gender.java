//12.Print gender (Male/Female) program according to given M/F using switch

import java.util.Scanner;
public class gender {
   public static void main(String args[]){ 
   Scanner sc= new Scanner(System.in);
   System.out.println("Enter your gender(M/F)");
   char n= sc.next().charAt(0)
          ;
   switch(n){//this will return 0
    case 'M':
    case 'm':  
    System.out.println("Male");
    break;
    case 'F':
    case 'f':
    System.out.println("Female");

}
      }
}
