package Final;

import java.util.Arrays;

public class practice1 {
    public static void main(String[] args) {
        finalClassPractice1 finalClassPractice1 = new finalClassPractice1();
        System.out.println(finalClassPractice1.name);

        //Т.к. массив – это объект, то final означает, что после присвоения ссылки на объект, уже нельзя изменить сам объект,
        //но можно изменять состояние объекта.

        final int[] array1 = {1,2,3,4,5};
        array1[0] = 9;	//ок, т.к. изменяем содержимое массива – {9,2,3,4,5}
//        array1 = new int[5]; //ошибка компиляции

        int[] array2 = {1,2,3,4,5};
        array2[0] = 9;	//ок, т.к. изменяем содержимое массива – {9,2,3,4,5}
        array2 = new int[10]; // ок
        System.out.println(Arrays.toString(array2));
    }
}
