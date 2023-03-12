import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int sumOfNumbers = 0; //сумма всех чисел
        int factorial = 1; // произведение всех числе


        for (int x = 0; x <= number; x++) {
            sumOfNumbers = sumOfNumbers + x;
        }

        for (int x = 1; x <= number; x++) {
            factorial = factorial * x;
        }
        System.out.println("Cумма всех чисел" + " " + "до :" + " " + number);
        System.out.println("Равняется:" + " " +sumOfNumbers);
        System.out.println(" ");
        System.out.println("Факториал числа, или произведение всех чисел, до числа :" + " " + number);
        System.out.println("Равен:" + " " +factorial);
    }
}
