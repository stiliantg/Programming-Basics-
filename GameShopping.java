import java.util.Scanner;

public class GameShopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int videocardsCount = Integer.parseInt(scanner.nextLine());
        int processorsCount = Integer.parseInt(scanner.nextLine());
        int RamCount = Integer.parseInt(scanner.nextLine());
//•	Видеокарта – 250 лв./бр.
//•	Процесор – 35% от цената на закупените видеокарти/бр.
//•	Рам памет – 10% от цената на закупените видеокарти/бр.
        double videocardPrice = videocardsCount * 250.0;
        double processorPrice = processorsCount * (videocardPrice * 0.35);
        double ramPrice = RamCount * (videocardPrice * 0.1);
        double TotalPrice = videocardPrice + processorPrice + ramPrice;

        if (videocardsCount > processorsCount) {
            TotalPrice = TotalPrice * 0.85;
        }

        double diff = budget - TotalPrice;

        if (budget >=TotalPrice) {
            System.out.printf("You have %.2f leva left!", Math.abs(diff));
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!" , Math.abs(diff));
        }
    }
}
