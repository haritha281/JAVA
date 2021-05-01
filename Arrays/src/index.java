// 3.Write a program to find the index of an array element
public class index {
   public static int  findindex(int[] my_array, int t) {
        if (my_array == null) return -1;
        int len = my_array.length;
        int i = 0;
        while (i < len) {
            if (my_array[i] == t) return i;
            else i=i+1;
        }
        return -1;
    }
    public static void main(String[] args) {
      int[] my_array = {54, 34, 23, 87, 45, 8, 48, 12, 9, 4};
      System.out.println("Index position of 54 is: " + findindex(my_array, 54));
      System.out.println("Index position of 45 is: " + findindex(my_array, 45));
       } 
}
