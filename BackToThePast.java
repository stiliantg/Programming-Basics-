package FOR;

import java.util.Scanner;

public class BackToThePast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       double money = Double.parseDouble(scanner.nextLine());
        int maxYear = Integer.parseInt(scanner.nextLine());
        double moneySpent =0;
        int yearsOld = 17;

        for (int i = 1800; i<=maxYear ; i++) {
            yearsOld++;
            if (i % 2 == 0) {
            moneySpent += 12000;
            } else {
                moneySpent += 12000 + yearsOld * 50;
            }
        }
        double diff = Math.abs(money - moneySpent);
        if (moneySpent <= money) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.",diff);
        }else {
            System.out.printf("He will need %.2f dollars to survive.",diff);
        }
    }
}
