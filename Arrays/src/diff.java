//16. Write a function to get the difference of largest and smallest value
import java.util.*;
public class diff {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter no. of elements you want in array:");
    int n = sc.nextInt();
    int a[] = new int[n];
    System.out.println("Enter all the elements:");
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    int n1 = display(a);
    System.out.println("difference of largest and smallest value is "+n1);
  }
  public static int display(int[] array)
  {
    Arrays.sort(array);
    int n = array[array.length - 1] - array[0];
    int b = array.length;
    if (b == 1) {
      n = array[0];
    }
    return n;
  }
}
