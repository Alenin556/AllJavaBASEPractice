package Other;

import java.util.Scanner;

public class RectangleArea {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int width = read.nextInt();
        int height = read.nextInt();
        printArea(width, height);
    }

    //завершить нижний метод
    public static void printArea(int x , int y){
        System.out.println(x * y);
    }
}