package OOP.lesson7OOP;

import java.util.Arrays;

public class Cat {

    String color;
    double weight;
    String ownerName;

    public Cat(String color, double weightCat, String ownerName){
        this.color = color;
        this.weight = weightCat;
        this.ownerName = ownerName;
    }

    public void actionCat(String ownerName) {
        System.out.println("Кот дерется с котом "+ ownerName);
    }

//    public void feed(String[] products){
//        System.out.println("Кот поел : " + Arrays.toString(products));
//    }

    //varArgs = []
    public void feed(String ...products){  //varArgs должен быть последним в перечне атрибутов у метода
        System.out.println("Кот поел : " + Arrays.toString(products));
    }

    public String hunt(boolean isNight) {
        if (!isNight) {
            return "После охоты кот принес : мышь";
        }
        return "После охоты кот принес : сову";
    }


    public String hunt(boolean isNight, boolean success){
        if (success){
            if (!isNight) {
                return "После охоты кот принес : мышь";
            }
            return "После охоты кот принес : сову";
        } return "Ничего";
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }


}
