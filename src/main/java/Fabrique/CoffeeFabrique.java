package Fabrique;

import Fabrique.CoffeTypes.Americano;
import Fabrique.CoffeTypes.Cappuccino;
import Fabrique.CoffeTypes.Espresso;
import Fabrique.CoffeTypes.Latte;
import Fabrique.CoffeTypes.Coffee;

import java.util.Scanner;

public class CoffeeFabrique {
    public Coffee orderCoffee() {

        System.out.println("Какой кофе вы желаете ?");
        System.out.println("1.AMERICANO");
        System.out.println("2.ESPRESSO");
        System.out.println("3.CAPPUCCINO");
        System.out.println("4.LATTE");
        Coffee coffee = null;
        Scanner sc = new Scanner(System.in);
        int type = sc.nextInt();
        String typeCoffee = null;

        switch (type) {
            case 1:
                coffee = new Americano();
                typeCoffee = "Americano";
                break;
            case 2:
                coffee = new Espresso();
                typeCoffee = "Espresso";
                break;
            case 3:
                coffee = new Cappuccino();
                typeCoffee = "Cappuccino";
                break;
            case 4:
                coffee = new Latte();
                typeCoffee = "Latte";
                break;
        }

        coffee.grindCoffee();
        coffee.makeCoffee();
        coffee.pourIntoCup();

        System.out.println("Вот ваш кофе " + typeCoffee + "! Спасибо, приходите еще!");
        System.out.println("Был создан объект: " + coffee);
        return coffee;
    }
}
