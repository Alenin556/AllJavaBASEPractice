package ConstructorObjectInterfacePractice;

public class Dog extends Animal implements Actions {

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
        System.out.println("Hello I'm dog =)");
    }

    @Override
    public void run() {
        System.out.println("Dog run");
    }
    @Override
    public void fight(){
        System.out.println("Dog fight");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("Bobik");
        System.out.println(dog.getName());
        dog.say();
        dog.fight();
        dog.runner();
        Actions.method();
        System.out.println("_____");
        System.out.println("Давайте прочитаем число  из интерфейса : " + Actions.constant);
    }
}
