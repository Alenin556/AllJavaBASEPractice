package Animals;

public class Dog extends Animal {

    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void say() {
        System.out.println("Hello O'm dog =)");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("Bobik");
        System.out.println(dog.getName());
        dog.say();
    }
}
