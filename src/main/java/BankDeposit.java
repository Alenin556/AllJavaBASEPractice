import java.util.Scanner;

public class BankDeposit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите страну проживания.");
        System.out.println("Открытие счета доступно только для граждан проживающих на территории России.");
        String clientCountry = sc.nextLine();
        if (!(clientCountry.equals("Россия"))) {
            System.out.println("Вы не можете открыть счет в нашем банке.");
            System.out.println("Наш банк принимает заявление на открытие счета, только от лиц проживающим на территории России.");
            System.exit(0);
        }

        System.out.println("Введите валюту в которой хотите открыть сберегательный счет.");
        System.out.println("Доступно : руб.");
        System.out.println("Недоступно : eur, usd");
        String currency = sc.nextLine();
        if (!(currency.equals("руб."))) {
            System.out.println("Вы не можете открыть счет в нашем банке.");
            System.out.println("Наш банк принимает валюту только в рублях.");
            System.out.println("Попробуйте оформить счет с другой валютой.");
            System.exit(0);
        }

        System.out.println("Введите ваше фио. ");
        String fullName = sc.nextLine();

        System.out.println("Введите ваш возраст.");
        int age = sc.nextInt();
        if ((!(age > 18))) {
            System.out.println("Вы не можете открыть счет в нашем банке.");
            System.out.println("Наш банк принимает заявление на открытие счета, только от лиц старше 18 лет.");
            System.exit(0);
        }

        System.out.println("Введите сумму денег.");
        System.out.println("Предупреждаем, что наш банк для открытия счета принимает стартовое вложение в размере от 100 000 руб.");
        int money = sc.nextInt();
        if (money <= 100000) {
            System.out.println("Вы не можете открыть счет в нашем банке.");
            System.out.println("Наш банк для открытия счета принимает стартовое вложение в размере от 100 000 руб.");
            System.out.println("Укажите другую сумму.");
        }

        System.out.println("Введите период на который вы бы хотели открыть счет.");
        System.out.println("Предупреждаем, что период не может быть меньше 2 и больше 10 лет.");
        int period = sc.nextInt();

        if (period <=2 || period > 10) {
            System.out.println("Вы не можете открыть счет в нашем банке.");
            System.out.println("Наш банк предоставляет возможность открытия счета от 3 до 10 лет.");
            System.out.println("Укажите другой период хранения.");
        }

        System.out.println(" ");
        System.out.println(" ");

        int periodPercent = ((money * 7) / 100) * period;




        System.out.println(fullName);
        System.out.println("Поздравляем ! Вы успешно открыли счет в нашем банке.");
        System.out.println("На сумму :" + money);
        System.out.println("На период :" + period);
        System.out.println("По истечению срока хранения вам будут предоставлен доход от годовых процентов в размере : " + periodPercent);
        System.out.println("Будем рады вам в нашем банке.");
        }

    }

