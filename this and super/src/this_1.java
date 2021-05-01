//1. Print the fields/instance members of the current class using this
public class this_1 {
  int x;
  public this_1(int x) {
    this.x = x;
  }
  public static void main(String[] args) {
    this_1 myObj = new this_1(5);
    System.out.println("Value of x = " +myObj.x);
  }
}
