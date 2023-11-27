package ConstructorObjectInterfacePractice;

public class Cat implements Actions{

    private String name;
    private int age;
    private int weight;

    public Cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Cat() {
    }

    public void sayMeow() {
        System.out.println("Мяу!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        // проверка входящего параметра
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        // проверка входящего параметра
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        // проверка входящего параметра
        this.weight = weight;
    }

    @Override
    public void fight() {
        System.out.println("Cat fight");
    }

    @Override
    public void say() {
        System.out.println("Hello I'm Kitty");
    }

    @Override
    public void run() {
        System.out.println("Cat run");
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.run();
        cat.fight();
        cat.say();
    }
}