package AlfaTask;

import java.util.Scanner;

public class operatorChild {

    public static void main(String[] args) {
        System.out.println("Введите год рождения в формате 14.12.2014 : ");
        Scanner sc = new Scanner(System.in);
        String enterDate = sc.nextLine();
        operator("14.12.2023", enterDate);
    }

    public static void operator(String nowDate, String birthDate) {

        //обрезать и преобразовать в int
        String subNow = nowDate.substring(6);
        int intNowDate = Integer.parseInt(subNow);

        String subBirth = birthDate.substring(6);
        int intBirthdate = Integer.parseInt(subBirth);

        System.out.println("Год сегодня : " + intNowDate);
        System.out.println("Год рождения : " + intBirthdate);

        int result = intNowDate - intBirthdate;
        System.out.println("Ребенку : " + result + " лет");

        boolean check = result <= 6;
        boolean check1 = result == 7;
        boolean check2 = result == 14;

        if (check) {
            System.out.println("Ошибка системы! Доступ ограничен!");
            return;
        }
        if (check1) {
            System.out.println("Оператор : Child");
        } else if (check2) {
            System.out.println("Оператор : Child");
        } else {
            System.out.println("Оператор : Norm");
        }
    }

}
