public class Dog {
    //parameters
    private int age;
    private String name;
    private String color;
    private Owner owner;
    private int birthday;
    //constructor
    public Dog(int age, String name, String color, Owner owner){
        this.age = age;
        this.name = name;
        this.color = color;
        this.owner = owner;
    }

    //getters

    public int getBirthday() {
        return birthday;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public Owner getOwner() {
        return owner;
    }

    //setters
    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    private void addOneAge(){
        this.age++;
    }
    //The dog is named Marlo and is 5 years old. This dog is black.
    @Override
    public String toString() {
        return "The dog is named " + this.name + " and is " + age + " years old. This dog is " + color + ".";
    }
}
