package Static.Restaurant;

public class RestaurantsKitchen {

    //Создать сеть ресторанов, которая обладает общим для всех ресторанов, запасами продуктов: сосиски, хлеб.
    //Каждый ресторан может подать блюдо: тогда минус 1 сосиска и два куска хлеба из общего запаса.
    //Если сосисок или хлеба не хватает, тогда вывести на экран: нет ингредиентов!
    //Каждый ресторан может принять партию товара: плюс 100 сосисок и 200 кусков хлеба.
    //Запасы продуктов должны быть скрыты от чужих глаз.

    private static int sausages = 0;
    private static int bread = 20;

    public static int getSausages() {
        return sausages;
    }

    public static int getBread() {
        return bread;
    }


    protected void serveTheDishHotDog() {
        if (sausages > 0 && bread > 1) {
            System.out.println("Блюдо из 1 сосиски и 2 кусков хлеба");
            sausages--;
            bread -= 2;
            System.out.println("Хот дог приготовлен =)");
        } else {
            System.out.println("Нет ингредиентов =(");
        }
    }

    public static void acceptABatchOfFood() {
        if(sausages<100 || bread < 200){
            sausages +=100;
            bread += 200;
        }
    }
}
