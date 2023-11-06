package Funcional;

public class Sum8 {

    protected int sum8 (int three, int five){
        int result=0;
        if (three == 3 && five == 5){
            result = 3+5;
        }
        return result;
        // return 8;
    }

    public static void main(String[] args) {
        Sum8 sum8class = new Sum8();
        System.out.println(sum8class.sum8(3,5));
    }
}
