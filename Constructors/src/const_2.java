// 2. Call the constructors(both default and argument constructors) of super class from a child
//class
class Person{
   public int age;
   public Person(int age){
      this.age = age;
   }
   public void displayPerson() {
      System.out.println("Age: "+this.age);
   }
}
public class const_2 extends Person {
   public const_2( int age){
      super(age);
   }
   static int a;
   public static void main(String[] args) {
       const_2 obj=new const_2(10); //default constructor is called
        System.out.println("a="+a);
      Person person = new const_2(20);
      person.displayPerson();
   }
}