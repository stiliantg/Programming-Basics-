package FOR;

import java.util.Scanner;

public class EvenPowersof2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i <= n; i++) {
            double result = Math.pow(2, i);
            if (i % 2 == 0) {
                System.out.printf("%.0f%n",result);
            }
        }
    }
}