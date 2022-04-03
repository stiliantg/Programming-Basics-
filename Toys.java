import java.util.Scanner;

public class Toys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     //Цени на играчките:
        //•	Пъзел - 2.60 лв.
        //•	Говореща кукла - 3 лв.
        //•	Плюшено мече - 4.10 лв.
        //•	Миньон - 8.20 лв.
        //•	Камионче - 2 лв

        double tripPrice = Double.parseDouble(scanner.nextLine());
        int puzzleCount = Integer.parseInt(scanner.nextLine());
        int dollCount = Integer.parseInt(scanner.nextLine());
        int bearCount = Integer.parseInt(scanner.nextLine());
        int minionCount = Integer.parseInt(scanner.nextLine());
        int truckCount = Integer.parseInt(scanner.nextLine());

        double puzzle = puzzleCount * 2.60;
        double doll = dollCount * 3.0;
        double bear = bearCount * 4.10;
        double minion = minionCount * 8.20;
        double truck = truckCount * 2.0;

        double toysPrice = puzzle + doll + bear + minion + truck;
        int allCount = puzzleCount + dollCount + bearCount + minionCount + truckCount;

        if (allCount >= 50) {
            toysPrice = toysPrice * 0.75;

        }
        toysPrice = toysPrice * 0.90;
        double money = tripPrice - toysPrice;

        if (tripPrice <= toysPrice) {
            System.out.printf("Yes! %.2f lv left.",Math.abs(money));
        } else {
            System.out.printf("Not enough money! %.2f lv needed.",Math.abs(money));
        }

    }
}
