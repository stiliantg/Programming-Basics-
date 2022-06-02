package FOR;

import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int maxN = Integer.MIN_VALUE;

        for (int i = 1 ; i<=n ; i++) {
            int a = Integer.parseInt(scanner.nextLine());


            if (maxN < a) {
                maxN =a;
            }
            sum +=a;

        }
        int minSum = sum - maxN;
        int diff = Math.abs(maxN - minSum);

        if (minSum == maxN) {
            System.out.printf("Yes%nSum = %d",minSum);
        } else
            System.out.printf("No%nDiff = %d",diff);
    }
}
