public class Fish extends Animal {
    private String waterType;

    public Fish(String name, int age, String waterType){
        super(name, age);
        this.waterType = waterType;
    }

    @Override
    public void makeSound(){
        System.out.println(name + " blub blub");
    }

    @Override
    public void move(){
        System.out.println(name + " swims in " + waterType);
    }

    @Override
    public void eat(){
        System.out.println(name + " eats plankton and small fish");
    }
}
