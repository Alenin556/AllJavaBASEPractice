package IF;

import java.util.Scanner;

public class ElseIF {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String condition = sc.nextLine();

        if (condition.equals("Привет")) {
            System.out.println("Hi boy!");// блок кода, который выполняется, если условие condition1 истинно
        } else if (condition.equals("Здравствуйте")) {
            System.out.println("Good morning mister!");// блок кода, который выполняется, если условие condition2 истинно
        } else if (condition.equals("Пока")) {
            System.out.println("Goodbye");// блок кода, который выполняется, если условие condition3 истинно
        } else {
            System.out.println("What do you want?");// блок кода, который выполняется, если предыдущие условия ложны
        }
    }
}
