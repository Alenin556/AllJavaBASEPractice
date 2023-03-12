import java.util.Arrays;
import java.util.Scanner;

public class SeatsInTheatre {
    public static void main(String[] args) {

        System.out.println("Добро пожаловать в наш кинотеатр");
        System.out.println("Перед вами представлена схема зала.");
        System.out.println("1 - это те места которое заняты.");
        System.out.println("0 - это те места которое cвободны.");
        int[][] seats = {
                {0, 0, 0, 1, 1, 1, 0, 0, 1, 1},//0
                {1, 1, 0, 1, 0, 1, 1, 0, 0, 0},//1
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},//2
                {0, 0, 0, 1, 1, 1, 1, 0, 0, 0},//3
                {0, 1, 1, 1, 0, 0, 0, 1, 1, 1} //4
        };     //0  1  2  3  4  5  6  7  8  9
        Scanner sc = new Scanner(System.in);
        System.out.println(Arrays.deepToString(seats).replace("], ", "]\n"));
//ваш код

        System.out.println("Выберете номер ряда и номер сидения, для приобретения билета.");
        System.out.println("Ряд считается с верху вниз , как : 0 - 1 - 2 - 3 - 4");
        System.out.println("Номер сидения считается слева на право , как : 0 - 1 - 2 - 3 -...- 9");
            int line = sc.nextInt();
            int element = sc.nextInt();
            if (seats[line][element] == 0) {
                System.out.println("Это сидение свободно.");
            } else {
                System.out.println("Это сидение занято.");
                System.out.println("Выберете другое место.");
            }
        }
    }
