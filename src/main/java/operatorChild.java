import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class operatorChild {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String enterDate = sc.nextLine();
        System.out.println("Введите год рождения:");
        checkBirth("14.12.2023",enterDate);
    }

    public static void checkBirth(String nowDate, String birthDate) {
        //обрезать и преобразовать в int
        String subNow = nowDate.substring(6);
        int intNowDate = Integer.parseInt(subNow);

        String subBirth = birthDate.substring(6);
        int intBirthdate = Integer.parseInt(subBirth);

        System.out.println("Год сегодня : " + intNowDate);
        System.out.println("Год рождения : " + intBirthdate);

        int result = intNowDate - intBirthdate;
        System.out.println("Ребенку : " + result +" лет");

        boolean check = result<=6;
        boolean check1 = result==7;
        boolean check2 = result==14;

        if(check) {
            System.out.println("Ошибка системы! Доступ ограничен!");
        }if(check1){
            System.out.println("Оператор : Child");
        } else if (check2){
            System.out.println("Оператор : Child");
        } else {
            System.out.println("Оператор : Norm");
        }
    }


    public void operator(String nowDate, String birthDate) {
        String birth ;


    }

//    public void operator(LocalDate nowDate, LocalDate birthday) {
//        String status;
//        if (birthday + 7 лет =<nowDate){
//            status = "Child";
//        } else if (birthday + 14 лет364дня = nowDate){
//            status = "Child";
//        } else{
//            status = "Norm";
//
//        }
    }
