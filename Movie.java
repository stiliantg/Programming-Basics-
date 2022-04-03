import java.util.Scanner;

public class Movie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        double dressPriceforOne = Double.parseDouble(scanner.nextLine());
        double decor = budget * 0.1;
        double dressPrice = dressPriceforOne * statists;

        if (statists > 150) {
            dressPrice = dressPrice * 0.9;
        }
        double diff = budget - (decor + dressPrice);

        if (decor + dressPrice > budget) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", Math.abs(diff));
        }else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.",Math.abs(diff));
        }
    }
}
