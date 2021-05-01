//5. Call constructor of the parent class using super()
class Animal {
  Animal() {
    System.out.println("I am an animal");
  } }
class Dog extends Animal {
  Dog() {
    super();
    System.out.println("I am a dog");
  }
}
class this_5 {
  public static void main(String[] args) {
    Dog dog1 = new Dog();
  }
}

