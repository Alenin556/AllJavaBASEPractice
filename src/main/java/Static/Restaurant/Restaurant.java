package Static.Restaurant;

public class Restaurant {
    public static void main(String[] args) {

        System.out.println("Пополнение запасов");
        RestaurantsKitchen.acceptABatchOfFood();

        RestaurantsKitchen rK = new RestaurantsKitchen();
        rK.serveTheDishHotDog();
        rK.serveTheDishHotDog();
        rK.serveTheDishHotDog();
        rK.serveTheDishHotDog();
        rK.serveTheDishHotDog();
        rK.serveTheDishHotDog();
        System.out.println("___________________");

        RestaurantsKitchen aK = new RestaurantsKitchen();
        aK.serveTheDishHotDog();
        aK.serveTheDishHotDog();
        aK.serveTheDishHotDog();
        aK.serveTheDishHotDog();
        aK.serveTheDishHotDog();
        aK.serveTheDishHotDog();
        System.out.println(RestaurantsKitchen.getBread());
        System.out.println("");
        System.out.println("Пополнение запасов");
        RestaurantsKitchen.acceptABatchOfFood();
        System.out.println("");
        System.out.println("Сосисок: " + RestaurantsKitchen.getSausages());
        System.out.println("Хлеба: " + RestaurantsKitchen.getBread());

        rK.serveTheDishHotDog();
        System.out.println("Сосисок: " + RestaurantsKitchen.getSausages());
        System.out.println("Хлеба: " + RestaurantsKitchen.getSausages());



    }
}
