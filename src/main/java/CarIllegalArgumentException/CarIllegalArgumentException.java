package CarIllegalArgumentException;

import static CarIllegalArgumentException.CarIllegalArgumentException.Car.runaway;
import static CarIllegalArgumentException.CarIllegalArgumentException.Car.sellCar;

public class CarIllegalArgumentException {

    public static void main(String[] args) {

        Car bmw = new Car("BMW", 250);
        Car nissanException = new Car("Nissan", 250);

        sellCar(bmw, "Andrew");
        try {
            sellCar(nissanException, "Andrew");
        } catch (IllegalArgumentException e) {
            System.out.println("Обратитесь в салон Nissan");
        }

        runaway(sellCar(bmw,"Alex"));
    }

    static class Car {
        String carBrand;
        int maxSpeed;
        Car key;

        public Car(String carBrand, int maxSpeed) {
            this.carBrand = carBrand;
            this.maxSpeed = maxSpeed;
        }

        public String getCarBrand() {
            return carBrand;
        }

        public static Car sellCar(Car car, String name) throws IllegalArgumentException {
            if (car.getCarBrand().equals("Nissan")) {
                throw new IllegalArgumentException("Мы не продаем Nissan");
            } else {
                System.out.println("Поздравляем с покупкой : " + car.getCarBrand() + "." + name);
            }
            return car.key;
        }

        public static void runaway(Car key) {
            if (key == key){
                System.out.println("Уехал в закат");
            }
        }
    }
}
