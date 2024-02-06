package Other;

public class Sale {
    public String saleDay = "Пятница 13";

    public int finalSale(int amount, String day){
        int finalAmount = 0;
        if (amount >= 1000 && day.equals(saleDay)){
            finalAmount = amount / 2;
        }
        return finalAmount;
    }

    public static void main(String[] args) {
        Sale sale = new Sale();
        System.out.println(sale.finalSale(1000, "Пятница 13"));
    }
}
