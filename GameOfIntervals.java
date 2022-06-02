package FOR;

import java.util.Scanner;

public class GameOfIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        double result = 0;
        int p0 = 0;
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;

        for (int i = 1; i <= num; i++) {
            int newNum = Integer.parseInt(scanner.nextLine());
            if (newNum < 0 || newNum > 50) {
                result = result / 2;
                p0++;
            } else if (newNum < 10) {
                result += newNum * 0.2;
                p1++;
            } else if (newNum < 20) {
                result += newNum * 0.3;
                p2++;
            } else if (newNum < 30) {
                result += newNum * 0.4;
                p3++;
            } else if (newNum < 40) {
                result += 50;
                p4++;
            } else if (newNum <= 50) {
                result += 100;
                p5++;
            }

        }
        double percent0 = (p0 * 1.0 / num) * 100;
        double percent1 = (p1 * 1.0 / num) * 100;
        double percent2 = (p2 * 1.0 / num) * 100;
        double percent3 = (p3 * 1.0 / num) * 100;
        double percent4 = (p4 * 1.0 / num) * 100;
        double percent5 = (p5 * 1.0 / num) * 100;

        System.out.printf("%.2f%n", result);
        System.out.printf("From 0 to 9: %.2f%%%nFrom 10 to 19: %.2f%%%nFrom 20 to 29: %.2f%%%nFrom 30 to 39: %.2f%%%nFrom 40 to 50: %.2f%%%nInvalid numbers: %.2f%%" , percent1 , percent2 , percent3 , percent4 , percent5, percent0);

    }
}