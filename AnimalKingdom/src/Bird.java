public class Bird extends Animal {
    private double wingSpan;

    public Bird(String name, int age, double wingSpan) {
        super(name, age);
        this.wingSpan = wingSpan;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " chirps");
    }

    @Override
    public void move() {
        System.out.println(name + " is flying" + " with a wingspan of " + wingSpan + " meters");
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating bird seed");
    }

    public void buildNest() {
        System.out.println(name + " is building a nest");
    }
}
