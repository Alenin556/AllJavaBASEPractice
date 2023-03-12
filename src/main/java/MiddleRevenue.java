import java.util.Scanner;

public class MiddleRevenue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] monthRevenue = {44750, 54430, 99700, 44500, 55000, 50000, 34000, 20300, 48000, 64000, 34800, 80900};

        double sum = 0;
        for ( int x= 0 ; x < monthRevenue.length ; x++) {
        sum = sum + monthRevenue[x];

        }
        double middle = sum / monthRevenue.length;
        System.out.println("Среднемесячный доход за год , составляет :" + " " + middle);
    }
}
