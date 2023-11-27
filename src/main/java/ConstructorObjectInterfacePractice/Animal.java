package ConstructorObjectInterfacePractice;

public class Animal {
    private String name;
    private int age;
    private int weight;


    public void say() {
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
}
