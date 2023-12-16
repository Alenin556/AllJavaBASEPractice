package OOP.start.lesson5Cycles;

public class ForEach {
    public static void main(String[] args) {
        int[] numbers = {22, 33, 66, 134};
        int c = 2;

        
        for (int number : numbers){
            if(number % c == 0){
                System.out.println(number);
            }
        }
    }
}
