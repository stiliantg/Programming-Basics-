package FOR;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double washerPrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());
        double moneyeven = 0;
        double moneyodd = 0;

        for (int i = 1; i<=age ; i++) {
            if (i % 2 ==0){
                moneyeven = moneyeven + i * 5.0 - 1;
            } else {
                moneyodd = moneyodd + toyPrice;
            }
        }
        double allMoney = moneyeven + moneyodd;
        double diff = Math.abs(allMoney - washerPrice);

        if (allMoney >= washerPrice) {
            System.out.printf("Yes! %.2f",diff);
        } else {
            System.out.printf("No! %.2f",diff);
        }
    }
}
