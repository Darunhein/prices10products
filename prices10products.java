import java.util.Scanner;

    public class prices10products {
        
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final float DISCOUNT = .10;
        float totalPrice;
        float finalPrice;

        System.out.println("Enter the price of the first Product ");
        float priceProduct01 = scanner.nextFloat();

        System.out.println("Enter the price of the Second Product ");
        float priceProduct02 = scanner.nextFloat();

        System.out.println("Enter the price of the Third Product ");
        float priceProduct03 = scanner.nextFloat();

        System.out.println("Enter the price of the Forth Product ");
        float priceProduct04 = scanner.nextFloat();

        System.out.println("Enter the price of the Fifth Product ");
        float priceProduct05 = scanner.nextFloat();

        totalPrice = priceProduct01 + priceProduct02 + priceProduct01 + priceProduct02 + priceProduct01;
        finalPrice = totalPrice - (totalPrice * .10);

        System.out.println("The final price with the discount of 10% added is: $"+finalPrice);


        }
    }