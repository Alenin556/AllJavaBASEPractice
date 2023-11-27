package SOLID;

public class L {
    static class Thermometer {
        protected int temperature;
        protected int maxTemperature = 80;

        public void setTemperature(int temperature) {
            this.temperature = temperature;
        }

        public int getTemperature(){
            return temperature;
        }

        public int getMaxTemperature() {
            return maxTemperature;
        }

        public void displayTemperature(){
            System.out.println("Температура равна: " + getTemperature());
        }
    }

    static class ThermometerF extends Thermometer {

        public int getTemperatureInF() {
            int temperatureF = (temperature * 9/5) + 32;
            return temperatureF;
        }

        // переопределяет и дополняет логику выполнения метода
        @Override
        public void displayTemperature(){
            System.out.println("Температура равна: " + getTemperature());
            System.out.println("Температура в Фаренгейтах равна: " + getTemperatureInF());
        }

    }

    public static void main(String[] args) {
        ThermometerF thermometerF = new ThermometerF();
        thermometerF.setTemperature(45);
        thermometerF.displayTemperature();
    }

}
