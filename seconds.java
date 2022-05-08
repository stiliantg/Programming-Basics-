import java.util.Scanner;

public class seconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds1 = Integer.parseInt(scanner.nextLine());
        int seconds2 = Integer.parseInt(scanner.nextLine());
        int seconds3 = Integer.parseInt(scanner.nextLine());

        int totalsec = seconds1 + seconds2 + seconds3;
                int totalmin = totalsec / 60;
                int seconds = totalsec % 60;

                if (seconds <10) {
                    System.out.printf("%d:0%d", totalmin , seconds);


                }else {
                    System.out.printf("%d:%d", totalmin , seconds);
                }
    }
}
