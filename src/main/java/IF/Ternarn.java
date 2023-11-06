package IF;

import java.util.Scanner;

public class Ternarn {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Сколько у вас денег?");
        System.out.println("Введите число в рублях : ");
        int money = sc.nextInt();
        boolean condition = money >= 1000;
        String expression1 = "Мало";  //первое выражение
        String expression2 = "Много"; //второе выражение
        String result = condition ? expression1 : expression2;
        System.out.println(result); // "Число равно или меньше 10!"

    }
}
