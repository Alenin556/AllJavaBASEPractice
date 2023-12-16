package Stringg;

public class FormatPractice {
    public static void main(String[] args) {
        String carMark = "Audi";
        String carModel = "Q3";
        double price = 15_000.000;
        boolean hasAutomaticTransmission = true;
        //Задача: С помощью String format составить строку:
        //Привет, я менеджер салона [имя бренда]
        //У нас есть модель - [имя модели] за [Цена]
        //Есть ли у нее автоматическая коробка передач?
        //[Да/Нет]

        String phrase1 = String.format("Привет я менеджер салона %s", carMark);
        String phrase2 = String.format("У нас есть модель %s за %f", carModel, price);
        String phrase3 = String.format("Есть ли у нее автоматическая коробка передач?  %b", (hasAutomaticTransmission ? "Да" : "Нет"));
        System.out.println(phrase1);
        System.out.println(phrase2);
        System.out.println(phrase3);
    }
}
