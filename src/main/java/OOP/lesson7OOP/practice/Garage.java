package OOP.lesson7OOP.practice;

public class Garage {
    //Создать класс гараж, насчитанный на две машины. При создании гараж пустой.
    //Создать сеттеры на две машины в гараже.
    //Создать метод "дай информацию о машинах": Печатает на экран марка + вызов метода разгон до 100

    private Car auto1;
    private Car auto2;

    public Garage() {
    }

    public Garage(Car auto1, Car auto2) {
        this.auto1 = auto1;
        this.auto2 = auto2;
    }

    public void setAuto1(Car auto1) {
        this.auto1 = auto1;
    }

    public void setAuto2(Car auto2) {
        this.auto2 = auto2;
    }

    public void getCarInfo(Car car){
        System.out.println(car.getMark());
        car.speed();
        System.out.println("_________________________________________");
    }

    public void getGarageInfo(){
        getCarInfo(auto1);
        getCarInfo(auto2);
    }
}
