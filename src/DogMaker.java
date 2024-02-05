public class DogMaker {
  
  public static void main(String[] args) {
    Owner owner = new Owner("John", "Wick", "0800322520");
    //i am confused because the readme only gives three parameters for the dog, but the constructor it told you to make earlier has 4, so this is my compromise
    Dog dog = new Dog(2, "Jill", "black and tan", owner);
    dog.setName("Jessie");
    System.out.println(dog.getAge());
    //i'm not sure what the birthday method the readme is referring to so i added a parameter to the dog class
    int age = dog.getBirthday();
    System.out.println(dog.getAge());
    System.out.println(dog);
  }
  
}
