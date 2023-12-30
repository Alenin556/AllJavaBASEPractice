package AbstractInterfacePractice;

import AbstractInterfacePractice.AbstractactPackage.Clasas;
import AbstractInterfacePractice.AbstractactPackage.Developer;
import AbstractInterfacePractice.AbstractactPackage.Worker;

public class Runner {
    public static void main(String[] args) {

        //унаследовавшись от абстрактного класса мы унаследовали конструктор и методы геттеры и сеттеры для класса
        //имеем объект наследник в котором предусмотрены полями и методы
        Developer developer = new Developer(1,"Andrew");
        System.out.println(developer.getName());



    }
}
