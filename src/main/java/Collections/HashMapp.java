package Collections;


import equalshascode.Animal;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashMapp {
    public static void main(String[] args) {

        Person person1 = new Person("Mike", 34);
        Person person2 = new Person("Mike", 34);
        Person person3 = new Person("Frank", 35);
        System.out.println (person1.equals(person2)); //true

        //hashcode необходим для сравнения объектов, и для определения позиции элементов в структуре данных HashMap
        // в HashMap для ключей высчитывается hashcode, который определяет позицию
        // по умолчанию метод генерирует разные числа,
        // переопределяется метод для того, чтобы учитывать конкретные параметры при генерировании hash объекта
        // в случае если этого не делать то для разных объектов могут вернуться одинаковые hash.

        //Если объекты одинаковы по equals и по hashcode, тогда старый элемент перезаписывается новым.

        // В случае если была достигнута коллизия, то в структуре HashMap внутри ячейки создается двунаправленный список,
        // который будет хранить разные элементы с одинаковым hash.

        Map<Person, String> map = new HashMap();
        map.put(person1, "1");
        map.put(person2, "2");
        map.put(person3, "3");

        System.out.println(map.get(person1).hashCode());
        System.out.println(map.get(person2).hashCode());

        System.out.println(map.get(person3).hashCode());

    }


    static class Person{
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public boolean equals(Object o){
            Person person = (Person) o;
            //Результат сравнения будет true если поля совпадают
            return age == person.age &&
                    name.equals(person.name);
        }

        @Override
        public int hashCode() {
            int prime = 31;
            return prime* Objects.hash(name, age);
        }
    }



}
