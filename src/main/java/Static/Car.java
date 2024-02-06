package Static;

public class Car {

    public String brand;
    private static int id = 1;

    static int  porscheCarPrice = 5_000_000;
    static int lamborghiniCarPrice = 10_000_000;

    static int countCars = 0; // static привязывает атрибут к классу, не static привязан к экземпляру класса


    public Car(String brand) {
        this.brand = brand;
        countCars ++;
    }

    public int getCountCars() {
        return countCars; // не в static методах, мы можем вызывать static атрибуты
    }

    public static int getLamborghiniCarPrice() { // static методы могут вызывать и использовать static атрибуты
        return lamborghiniCarPrice;
    }

    public static int getPorscheCarPrice() {
        return porscheCarPrice;
    }

    public static void saleNotification(){
        System.out.println("Скоро распродажа!!!");
    }

    public static void printInfo(){
      //  this.brand // static метод ничего не знает о переменных которые создаются для экземпляров!
        // мы не можем вызывать в static методах не static атрибуты и не static методы
        System.out.println("Доступные бренды: porsche, lamborghini");
        System.out.println("Количество машин: " + countCars);
        saleNotification(); // метод static поэтому мы можем его вызывать
    }

    //не статические методы могут использовать внутри себя статические методы
    public void print(){
        printInfo();
    }
}
