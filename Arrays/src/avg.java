//2.Write a function to calculate the average value of an array of integers
public class avg {
     public static void main(String[] args) {   
        int []arr = new int[]{1,2,3,4,5};  
        int sum = 0;   
        for (int i = 0; i<arr.length; i++) {  
           sum = sum + arr[i];  
        }  
        System.out.println("Average: "+sum/5);  
    }  
}
