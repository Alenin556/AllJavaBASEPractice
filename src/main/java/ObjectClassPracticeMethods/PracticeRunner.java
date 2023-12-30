package ObjectClassPracticeMethods;

import java.util.HashMap;

public class PracticeRunner {
    public static void main(String[] args) {
        //метод toString предназначен для получения информации состояния полей объекта

        Person person1 = new Person("Andrew",27);
        Person person2 = new Person("Andrew",27);
        Person person3 = new Person("Andrew",28);
        System.out.println(person1.toString());
//        System.out.println(person1 == person2); // false

        // метод hashcode() позволяет задать числовое значение для объекта, по этому числу можно сравнивать объекты
        // переопределяется hashcode() потому что метод по умолчанию дает разные результаты, и для избежания коллизии,
        // когда сравниваются объекты, они могут быть не равны по equals, но равны по hashcode

        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());

        HashMap<Person, String>map = new HashMap<>();
        map.put(person1, "1");
        map.put(person2, "2");
        System.out.println(map.get(person1).hashCode());
        System.out.println(map.get(person2).hashCode());
        //почему разные ?

        //метод equals() по умолчанию предназначен для сравнения ссылок на объекты и строк,
        //переопределяется метод для того что бы сравнивать объекты структурно

        System.out.println(person1.equals(person2)); //true
        System.out.println(person1.equals(person3)); //false

        //метод getClass() нужен для получения типа данных объекта и для получения его вложенности
        System.out.println(person1.getClass());


    }

static class Person{

        String name;
        int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o){
        Person person = (Person) o;
        if(this.name == person.name && this.age == person.age){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode(){
        return age/2 + 100;
    }
}

}
