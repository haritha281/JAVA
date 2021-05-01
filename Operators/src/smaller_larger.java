// 7. Print the smaller and larger number
import java.util.*;
public class smaller_larger {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter first number\n");
        int a= sc.nextInt();
        System.out.print("Enter second number\n");
        int b= sc.nextInt();
        if(a>b)
           System.out.println(a+" is larger than "+b);
        else if(b>a)
            System.out.println(a+" is smaller than "+b);
        else
            System.out.println(a+" is equal to "+b);
}
}
