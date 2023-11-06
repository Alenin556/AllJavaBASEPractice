package Static;

public class Runner {

    public static void main(String[] args) {

        // В салон привезли две машины

        Car porsche = new Car("porsche");
        System.out.println(porsche.getCountCars()); // результат 1

        Car lamborghini = new Car("lamborghini");
        System.out.println(lamborghini.getCountCars()); //если поле countCars static, то результат 2, так как countCars больше не принадлежит к экземпляру класса

        Car.printInfo();
        //Покупатель хочет узнать цену за каждую
        System.out.println("Стоимость lamborghini: " + Car.getLamborghiniCarPrice()); // обращаемся к статическим методам, которые возвращают статические атрибуты, которые принадлежат классу
        System.out.println("Стоимость porsche: " + Car.getPorscheCarPrice());
    }
}
