package OOP.start.lesson4ConditionalOperators;

public class BooleanLogic {
    public static void main(String[] args) {
        // МАМА : Сынок купи хлеб =)
        boolean isBoughtBread = true;
        boolean isBoughtMilk = true;

        // AND && - логическое и, если два значения true, то значение равно true, иначе false
        // OR || - логическое или, если одно из значений true а другое false, то значение true, и только если все значения false, значение false
//        boolean milkAndBread = true || true; //true
//        boolean milkAndBread = true || false; //true
//        boolean milkAndBread = false || false; //false

        if (isBoughtMilk && isBoughtBread) {
            System.out.println("Сынок ты лучший сын! =)");
        } else if (isBoughtMilk || isBoughtBread) {
            System.out.println("Сынок ты молодец =)");
        } else {
            System.out.println("Собирай вещи ты здесь больше не живешь! ^_^");
        }

        //Купил сладости
        boolean isBoughtCandy = true;

        //NOT ! - Логическое не, которое переворачивает условие true на false (неtrue !true), и наоборот false на true
        if(!isBoughtCandy){
            System.out.println("Хорошо что ты не купил сладости");
        } else {
            System.out.println("Опять ты купил сладости");
        }

    }
}
