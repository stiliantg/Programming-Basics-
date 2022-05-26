import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String serial = scanner.nextLine();
        int episodeLength = Integer.parseInt(scanner.nextLine());
        int rest = Integer.parseInt(scanner.nextLine());

         double lunchtime = rest / 8.0;
        double otdih = rest /4.0;
        double RestoftheRest = rest - (lunchtime + otdih);
        double diff = RestoftheRest - episodeLength;

        if (RestoftheRest >= episodeLength) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time." , serial , Math.ceil(diff));
        } else {
            diff = episodeLength - RestoftheRest;
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes." , serial , Math.ceil(diff));
        }
    }
}
