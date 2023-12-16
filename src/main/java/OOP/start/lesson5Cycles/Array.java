package OOP.start.lesson5Cycles;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        int[] array = new int[2];
        array[0] = x;
        array[1] = y;

        int[] newArray = new int[]{x + 10,y + 10};

        int[] anotherArray = {x + 20 , y + 20};

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(newArray));
        System.out.println(Arrays.toString(anotherArray));

        System.out.println(array[0]);
        System.out.println(array[1]);

        int[] array2 = array;
        System.out.println(array2.equals(array));//true
    }

}