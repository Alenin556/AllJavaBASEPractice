package OOP.lesson7OOP;

import java.util.Arrays;

public class Dog {

    //Значения по умолчанию
    private String name = "Lord";
    private double weight = 50;
    private String owner = "Andrey";

    //Блок инициализации
    {
        System.out.println("Создается объект");
    }

    //Конструктор со значениями по умолчанию
    public Dog() {
    }

    //Конструктор
    public Dog(String name, double weight, String owner) {
        this.name = name;
        this.weight = weight;
        this.owner = owner;
    }

    public void feed(String ...products){  //varArgs должен быть последним в перечне атрибутов у метода
        System.out.println("Cобака поела : " + Arrays.toString(products));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double newWeight) {
        if (weight < 1) {
            this.weight = 5;
        } else {
            this.weight = newWeight;
        }
    }

    public String getOwner() {
        return "Мr." + owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", owner='" + owner + '\'' +
                '}';
    }


    //Блок инициализации
    {
        System.out.println("Объект создался");
    }
}
