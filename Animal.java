abstract class Animal {
  abstract void makeSound();
}

 class Dog extends Animal {
  void makeSound() {
    System.out.println("Woof!");
    System.out.println("Dog is barking!");
  }
  public static void main(String[] args) {
    Dog dog = new Dog();
    dog.makeSound(); // Output: Woof!
  }
}
