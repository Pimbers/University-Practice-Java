public class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }


    @Override
    public void makeSound() {
        System.out.println(name + " barks");
    }

    @Override
    public void move() {
        System.out.println(name + " is running");
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating dog food");
    }

    public String getBreed() {
        return breed;
    }

    public void fetch() {
        System.out.println(name + " is fetching the ball");
    }
}
