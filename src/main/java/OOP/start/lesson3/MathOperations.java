package OOP.start.lesson3;

public class MathOperations {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        //Сложение
        int sum = x + y;
//        System.out.println(sum);

        //Вычитание
        int diff = x - y;
//        System.out.println(diff);

        //Умножение
        int multiply = x * y;
//        System.out.println(multiply);

        //Деление
        int divide = x / y;
//        System.out.println(divide);

        //Деление с плавающей точкой
        x = 7;
        double divide1 = (double) x / y;
//        System.out.println(divide1);

        //Возведение в степень
        int ext = x * x;
//        System.out.println(ext);

        //инкремент - прибавление к числу единицы
//        x = x + 1; // 8
//        x++; // 9

        //Сокращенная форма записи
//        x += 10; // + 10
//        x *= 5;
//        x /= 3;
//        System.out.println(x);

        //Декремент - уменьшение на единицу
//         x = x - 1;
//         x--;
//        System.out.println(x);

        // Остаток от деления
        int number = 10;
        // 10 - 5 - 5 = 0;
        // 10 - 3 - 3 - 3 = 1;
        int modulo = 10 % 3;
        System.out.println(modulo);

        // Задача индекс массы тела : вес / (рост * рост) // рост в метрах
        float h = 1.78F;
        int w = 87;
        float index = w / (h * h);
        System.out.println(index);
    }
}
