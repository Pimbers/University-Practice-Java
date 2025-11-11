public class AnimalTest {
public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 3, "Golden Retriever");
        Bird bird = new Bird("Tweety", 2, 0.25);
        Fish fish = new Fish("Nemo", 2, "Salt");

        dog.performActions();
        System.out.println();
        bird.performActions();
        System.out.println();
        fish.performActions();
        System.out.println();

        System.out.println("\n=== Polymorphic Array ===");

        Animal[] animals = {dog, bird, fish};

        for (Animal animal : animals){
            animal.makeSound();
            animal.move();
            System.out.println();
        }

        for (Animal animal : animals) {
            animal.sleep();
        }
    }
}

