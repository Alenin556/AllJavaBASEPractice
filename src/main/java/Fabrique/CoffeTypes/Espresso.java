package Fabrique.CoffeTypes;

public class Espresso extends Coffee {
    public void grindCoffee() {
        System.out.println("перемалываем Espresso");
    }

    public void makeCoffee() {
        System.out.println("делаем Espresso");
    }

    public void pourIntoCup() {
        System.out.println("наливаем Espresso в чашку");
    }
}
