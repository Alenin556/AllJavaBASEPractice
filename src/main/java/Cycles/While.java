package Cycles;

import java.util.Random;
import java.util.Scanner;


public class While {

    public static void main(String[] args) {

        int temperature = 35;

        while (temperature <= 50) {
            System.out.println("Температура в пробирке поднялась до: " + temperature);
            temperature = temperature + 2;
        }
        System.out.println("Температура в пробирке слишком высокая: " + temperature);
        System.out.println("Необходимо приостановить опыт!");

    }
}
