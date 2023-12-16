package OOP.lesson7OOP.practice;

public class Auto {

    public static void main(String[] args) {
        Car zvorkinCar = new Car("ZvorkinCar");
//        zvorkinCar.speed();

        Car superCar = new Car("SuperCar",470);
//        superCar.speed();

        Car audi = new Car("Audi", 250);
        Car bmw = new Car("BMW", 260);

        Garage garage = new Garage();
        garage.setAuto1(zvorkinCar);
        garage.setAuto2(superCar);

        garage.getGarageInfo();


    }


}
