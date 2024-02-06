package Other;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double c = sc.nextDouble();

        System.out.println(fahr(c));
    }

    //ваш код
    public static double fahr(double temperature) {
        double result = 1.8 * temperature + 32;
        return result;
    }
}
