package SOLID;

public class O {
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

        //дополняет функционал
        public int setComfortableTemperature10(){
            if (getTemperature() >= 45){
                setTemperature(35);
            }
            return temperature;
        }

        //дополняет функционал и не переписывает логику
        public void displayTemperatureF(){
            System.out.println("Температура в Фаренгейтах равна: " + ((getTemperature()* 9/5) + 32));
        }

    }

    public static void main(String[] args) {
        ThermometerF thermometerF = new ThermometerF();
        thermometerF.setTemperature(45);
        thermometerF.setComfortableTemperature10();
        thermometerF.displayTemperature();
        thermometerF.displayTemperatureF();
    }

}
