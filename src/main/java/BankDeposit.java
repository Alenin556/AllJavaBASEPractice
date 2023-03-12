import java.util.Scanner;

public class BankDeposit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// сделать так чтобы если не выполняется одно действие компиляция прерывается
        String[] country = {"Россия", "Америка", "Китай"};
        String clientCountry = sc.nextLine();
        String currency = sc.nextLine();
        String firstName = sc.nextLine();
        String lastName = sc.nextLine();
        int age = sc.nextInt();
        int money = sc.nextInt();
        int period = sc.nextInt();

        int periodPercent = ((money * 7) / 100) * period;

        if (!(clientCountry.equals("Россия"))) {
            System.out.println("Вы не можете открыть счет в нашем банке.");
            System.out.println("Наш банк принимает заявление на открытие счета, только от лиц проживающим на территории России.");
        }
        if ((!(age > 18))) {
            System.out.println("Вы не можете открыть счет в нашем банке.");
            System.out.println("Наш банк принимает заявление на открытие счета, только от лиц старше 18 лет.");
        }
        if (!(currency.equals("руб."))) {
            System.out.println("Вы не можете открыть счет в нашем банке.");
            System.out.println("Наш банк принимает валюту только в рублях.");
            System.out.println("Укажите другую валюту");
        }
        if (money <= 100000) {
            System.out.println("Вы не можете открыть счет в нашем банке.");
            System.out.println("Наш банк для открытия счета принимает стартовое вложение в размере от 100 000 руб.");
            System.out.println("Укажите другую сумму.");
        }
        if (period <=2 || period > 10) {
            System.out.println("Вы не можете открыть счет в нашем банке.");
            System.out.println("Наш банк предоставляет возможность открытия счета от 3 до 10 лет.");
            System.out.println("Укажите другой период хранения.");
        }
        else {
            System.out.println(firstName + " " + lastName);
            System.out.println("Поздравляем ! Вы успешно открыли счет в нашем банке.");
            System.out.println("На сумму :" + money);
            System.out.println("На период :" + period);
            System.out.println("По истечению срока хранения вам будут предоставлен доход от годовых процентов в размере : " + periodPercent);
            System.out.println("Будем рады вам в нашем банке.");
        }

    }
}

