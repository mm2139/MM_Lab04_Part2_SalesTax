import java.util.Scanner;

public class SalesTaxCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double itemPrice;
        double itemPriceWithSalesTax;

        System.out.println("Hello! Please input the price of your item to recieve a total with 5% sales tax applied.");
        itemPrice = scan.nextDouble();
        itemPriceWithSalesTax = itemPrice * 1.05;

        System.out.println("The price of your " + itemPrice + " dollars purchase is with a 5% sales tax applied is " + itemPriceWithSalesTax + " dollars. The sales tax amounts to " + (itemPriceWithSalesTax-itemPrice) + " dollars.");
    }
}