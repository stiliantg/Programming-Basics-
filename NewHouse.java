import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeFlowers = scanner.nextLine();
        int countFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double price = 0;
        double diff = 0;

        switch (typeFlowers) {
            case "Roses" :
                if (countFlowers > 80) {
                    price = (countFlowers * 5) * 0.9 ;
                } else {
                    price = countFlowers * 5;
                }
                break;

            case "Dahlias" :
                if (countFlowers > 90) {
                    price = (countFlowers * 3.80) * 0.85;
                }else {
                    price = countFlowers * 3.80;
                }
                break;

            case "Tulips" :
                if (countFlowers > 80) {
                    price = (countFlowers * 2.80) * 0.85;
                }else {
                    price = countFlowers * 2.80;
                }
                break;

            case "Narcissus" :
                if (countFlowers < 120) {
                    price = (countFlowers * 3) * 1.15;
                } else {
                    price = countFlowers * 3;
                }
                break;

            case "Gladiolus" :
                if (countFlowers < 80) {
                    price = (countFlowers * 2.50) * 1.20;
                }else {
                    price = countFlowers * 2.50;
                }
                break;
        }
        diff = budget - price;
        if (price <= budget) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left." , countFlowers , typeFlowers , diff);
        }else {
            System.out.printf("Not enough money, you need %.2f leva more." , Math.abs(diff));
        }

    }
}
