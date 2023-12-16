package OOP.lesson7OOP;

import OOP.lesson7OOP.zoo.Zoo;

public class Runner {
    public static void main(String[] args) {

        Dog dog = new Dog("Мухтар", -10, "Andrey");
        System.out.println(dog);

        Cat cat = new Cat("white", 12, "Andrey");

        Zoo zoo = new Zoo(null, dog);
        zoo.feed();

    }
}
