package equalshascode.equals;

import com.beust.ah.A;

class Test {
    public static void main(String[] args) {
        //Тут мы сравниваем ссылки
        Animal animal0 = new Animal(1, "Tiger","SPB");
        Animal animal = animal0;
        System.out.println(animal0.equals(animal));

        //Здесь объект и структуру объектов
        Animal animal1 = new Animal(1, "Tiger","SPB");
        Animal animal2 = new Animal(1, "Tiger", "SPB");
        Animal animal3 = new Animal(2, "Tiger", "NY");
        Animal animal4 = new Animal(23, "Elephant", "NY");

        System.out.println(animal1.equals(animal2));
        System.out.println(animal1.equals(animal3));
        System.out.println(animal3.equals(animal4));

        System.out.println(animal1.hashCode());
        System.out.println(animal2.hashCode());
        System.out.println(animal3.hashCode());


    }
}

public class Animal {
    private int id;
    private String name;
    private String zooName;

    public Animal(int id, String name, String zooName) {
        this.id = id;
        this.name = name;
        this.zooName = zooName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        //Определяем тип объекта с которым будем сравнивать.
        Animal otherAnimal = (Animal) o;
        //Результат сравнения будет true если все поля совпадают
        return this.id == otherAnimal.id;
    }

    @Override
    public int hashCode() {
        int result = id != 0 ? 1000 : 0;
        result = 31 * result + id;
        return result;
    }
}
