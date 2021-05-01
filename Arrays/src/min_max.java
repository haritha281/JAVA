// 8.Write a function to find the minimum and maximum value of an array
import java.util.Arrays;
public class min_max {
public static void main(String[] args) {
int[] nums={6,-1,-2,-3,0,1,2,3,4};
Arrays.sort(nums);
System.out.println("Minimum = " + nums[0]);
System.out.println("Maximum = " + nums[nums.length-1]); 
}
}
