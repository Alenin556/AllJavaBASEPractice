package Static;

public class CarSaloon {
    public static void main(String[] args) {

        Car bmw = new Car("bmw");
        Car shkoda = new Car("shkoda");

        System.out.println("Количество машин в салоне: " + Car.countCars);

        Car.printInfo(); // если метод static, то мы можем вызвать метод обратившись к классу, не создавая экземпляр этого класса

    }
}
