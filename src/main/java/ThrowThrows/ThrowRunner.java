package ThrowThrows;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowRunner {
    public static void main(String[] args) throws FileNotFoundException {

        try {
            divide(1,0);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");;
        }



        try {
            uncheckedException("not_existing_file.txt");
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException");;
        }

    }

    public static double divide(double a, double b) {
        if (b == 0 || a == 0) {
            //пробрасываем исключение так как мы явно знаем что оно произойдет
            throw new ArithmeticException("Cannot division to zero!");
        }
        return a / b;
    }

    //предупреждаем что в методе может возникнуть исключение
    private static void uncheckedException(String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        FileInputStream stream = new FileInputStream(file);
    }


}
