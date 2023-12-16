package OOP.start.lesson5Cycles;

public class ForI {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4};
//        for (int i = 0; i<3; i++) {
//            System.out.println(numbers[i]);
//        }

        int[] numbers1 = {3, 2, 10, 5, 8};
        for (int x : numbers1){
            if(x % 2 == 0){          // % - определяет дробную часть, то что после "," ( например 1,2 - % относится к ,2))
                System.out.println(x);
            }
        }
    }
}
