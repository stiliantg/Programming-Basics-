package FOR;

import java.util.Scanner;

public class EqualPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pairs = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int maxDiff = 0;
        int sum2=0;

        for (int i = 1; i <= pairs; i++) {
            int a = Integer.parseInt(scanner.nextLine());
            int b = Integer.parseInt(scanner.nextLine());
            sum = a + b;
            if (i==1){
                sum2 = sum;
            }
            int diff = Math.abs(sum - sum2 );
            if (diff > maxDiff) {
                maxDiff = diff;
            }
            sum2 = sum;
        }
        if (maxDiff == 0) {
            System.out.printf("Yes, value=%d",sum);
        }else {
            System.out.printf("No, maxdiff=%d",maxDiff);
        }
    }
}
