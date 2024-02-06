package Other;

import ConstructorObjectInterfacePractice.Cat;

public class CatCheck {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Miskis");
        System.out.println(cat.getName());
        System.out.println(cat.getAge());
    }
}
