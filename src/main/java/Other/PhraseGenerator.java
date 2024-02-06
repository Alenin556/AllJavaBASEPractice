package Other;

public class PhraseGenerator {
    public static void main(String[] args) {
        String[] wordListOne = {"великолепно", "потрясающе", "супер-крутой", "невероятно"};
        String[] wordListTwo = {"летающий", "сосредоточенный", "внимательный"};
        String[] wordListThree = {"бэтмен", "супермен", "викинг", "рыцарь", "гонщик"};
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
        System.out.println("Нам срочно нужен" + phrase);
    }
}
