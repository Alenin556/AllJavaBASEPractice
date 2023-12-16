package OOP.start.lesson5Cycles;

public class MultiArray {
    public static void main(String[] args) {
        //Ограбили магазин
        //Следователь нашел две группы людей около магазина. Задача найти вора по росту.
        int[] group1 = {180, 192, 178};
        int[] group2 = {182, 142, 156};
        int[][] multiArray = {group1, group2};

        upperFor :
        for (int[] array : multiArray) {
            for (int h : array) {
                if (h == 178) {
                    System.out.println("Нашли вора");
                    break upperFor;
                } else {
                    System.out.println("Не подошел по росту");
                }
            }
        }

        int[] input1 = {1,2,3};
            for (int h : input1) {
                if (h == 2) {
                    System.out.println(input1[1]);
                }
            }









    }
}
