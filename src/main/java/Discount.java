public class Discount {
    public static void main(String[] args) {
        int amount = 4000;
        int discountPercent ;
        int discount;
        int result = 0;

        if (amount >= 4000) {
            discountPercent = 10;
            discount = ((amount * discountPercent) / 100);
             result = amount - discount;
            System.out.println("К вашему чеку" + " " + "на сумму" + " " + amount + " " + "применена скидка:" + " " + discountPercent + " %");
            System.out.println("К оплате:" + " " + result);
        } else if (amount >= 7000) {
            discountPercent = 20;
            discount = ((amount * discountPercent) / 100);
            result = amount - discount;
            System.out.println("К вашему чеку" + " " + "на сумму" + " " + amount + " " + "применена скидка:" + " " + discountPercent + " %");
            System.out.println("К оплате:" + " " + result);
        }
        else {
            System.out.println( "К оплате:" + " " + result);
        }

    }
}
