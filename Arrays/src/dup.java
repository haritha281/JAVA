//18.Write a program to remove the duplicate elements and return the new array
import java.util.Scanner;
public class dup {
    public static void main(String[] args){
		int [] arr = new int [10]; 
                int i,j,k;
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter array size: ");
		int s = sc.nextInt();
                System.out.println("Enter array elements");
                for(k=0;k<s;++k)
			arr[k] = sc.nextInt();
		System.out.println("After removing duplicate element array are :");
		for(i=0;i<s;++i){
                for(j=i+1;j<s;){
		if(arr[i] == arr[j]){
		for(int temp = j; temp<s; ++temp){
		arr[temp] = arr[temp+1];
		}
		s = s-1;		
                }		
		else
                j++;	}	
	}
            for(k=0;k<s;++k)
            System.out.println(arr[k]);
	}
}
