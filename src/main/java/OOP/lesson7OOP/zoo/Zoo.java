package OOP.lesson7OOP.zoo;

import OOP.lesson7OOP.Cat;
import OOP.lesson7OOP.Dog;

public class Zoo {
    private Cat cat;
    private Dog dog;

    public Zoo(Cat cat, Dog dog) {
        this.cat = cat;
        this.dog = dog;
    }

    public void feed() {
        cat.feed("Рыбу");
        dog.feed("Мясо", "Кости");
    }
}
