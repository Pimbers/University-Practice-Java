public abstract class Animal {
    public String name;
    public int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound(){
        System.out.println(name + " makes a sound");
    }

    public void move(){
        System.out.println(name + " is moving");
    }

    public abstract void eat();

    public final void sleep() {
        System.out.println(name + " is sleeping");
    }

    public void performActions() {
        System.out.println("--- " + name + "'s Actions ---");
        makeSound();
        move();
        eat();
        sleep();
    }
}
