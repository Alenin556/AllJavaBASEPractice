package OOP.start.lesson4ConditionalOperators;

public class Conditions {
    public static void main(String[] args) {

        int x = 10;
        int y = 40;
        String word = "число";

        if (x>y) {
            System.out.println("X больше Y");
        }else if (x == y) {
            System.out.println("X равен Y");
        }else if (x == 0) {
            System.out.println("X равен 0");
        }else if (y == 0) {
            System.out.println("Y равен 0");
        }else if (word.equals("число")) {
            System.out.println("Зачем нам число типа String ?");
        } else {
            System.out.println("Y больше X");
        }
    }
}
