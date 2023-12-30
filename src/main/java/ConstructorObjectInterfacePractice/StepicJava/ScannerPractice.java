package ConstructorObjectInterfacePractice.StepicJava;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {

        Scanner in = new  Scanner(System.in);
//        String input = in.nextLine();
//        int age = in.nextInt();
//        System.out.println("Привет, меня зовут" + input + ". Я работал программистом" + age + " лет.");


        int number1 = in.nextInt();
        int number2 = in.nextInt();
        int number3 = in.nextInt();
        int number4 = in.nextInt();
        int number5 = in.nextInt();
        System.out.println(number1+", "+number2+", "+number3+", "+number4+", "+number5);
    }
}
