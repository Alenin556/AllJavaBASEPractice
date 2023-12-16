package OOP.start.lesson3;

public class Primitives {
    public static void main(String[] args) {
        // Логические значения (boolean значения)
        // истина -> true -> да -> 1
        boolean answerAndrey = true;
        // ЛОЖЬ -> false -> нет -> 0
        boolean answerAlex = false;

        //Целые числа
        //Byte - байт
        byte maxByte = 127;
        byte minByte = -128;

        //Short - короткое число, состоит из двух байт или из 16 битов
        short maxShort = 32_767;
        short minShort = -32_768;

        //Integer - целое число, которое состоит из 4 байт или из 32 битов
        int maxInt = 2_147_483_647;
        int minInt = -2_147_483_648;

        //Long - целое число, которое состоит из 8 байт или из 64 битов
        long maxLong = 9_223_372_036_854_775_807L;
        long minLong = -9_223_372_036_854_775_808L;

        //Дробные числа
        // Double - число с плавающей точкой, 64 бит
        double myBottle = 1.5;
        //Float - число с плавающей точкой, 32 бит
        float cola = 0.33F;

        double doubleNumber = 1.12345678901234567890; // округляется до 1.1234567890123457
        float floatNumber = 1.12345678901234567890F; //  округляется до 1.1234568

//        System.out.println(doubleNumber);
//        System.out.println(floatNumber);

        //Char - character (символ), 16 бит
        char letter = 70;
        System.out.println(letter);
        char number = 1;

        char newLine = '\n';
        System.out.println("Привет" + newLine + "Как дела?");
    }
}
