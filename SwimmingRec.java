import java.util.Scanner;

public class SwimmingRec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timeOnemeter = Double.parseDouble(scanner.nextLine());
        double delay = (Math.floor(distance / 15)) * 12.5;
        double alltime = timeOnemeter*distance + (delay);
        double diff = record - alltime;

        if (alltime < record) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", alltime);
        }else{
            System.out.printf("No, he failed! He was %.2f seconds slower." ,Math.abs(diff));
        }

    }
}
