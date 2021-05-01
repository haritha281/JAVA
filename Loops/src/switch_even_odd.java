//11.Program to check whether a number is EVEN or ODD using switch
import java.util.Scanner;
public class switch_even_odd {
      public static void main(String args[]){ 
    Scanner sc= new Scanner(System.in);
   System.out.print("Enter a number\n");
   int n= sc.nextInt();
   switch(n%2){//this will return 0
    case 0:
    System.out.println(n+" is an Even number");
    break;
    case 1:
    System.out.println(n+" is an Odd number");

}
      }
}