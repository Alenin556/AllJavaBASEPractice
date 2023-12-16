package OOP.start.lesson4ConditionalOperators;

public class Ternary {
    public static void main(String[] args) {
        int money = 100;
        int breadPrice = 20;
        int candy = 50;

        money = money - breadPrice - candy;

        money = money >= 50 ? 0 : money;  // скрывает конструкцию else if

//        if (money >= 50){
//            money = 0;
//        } else {
//            money = money;
//        }

        System.out.println(money);
    }
}
