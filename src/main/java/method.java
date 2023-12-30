import java.util.Scanner;

public class method {

    public static void main(String[] args) {

        bot();
    }

    public static void bot() {
        Scanner sc = new Scanner(System.in);

        int userInput = sc.nextInt();

        switch (userInput) {
            case 1:
                System.out.println("Order confirmed");
                break;
            case 2:
                System.out.println("messenger@sololearn.com");
                break;
            default:
                System.out.println("Try again");
        }
    }
}
