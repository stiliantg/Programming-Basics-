import java.util.Scanner;

public class Book {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int allpages = Integer.parseInt(scanner.nextLine());
        int pagesperhour = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int hours = (allpages / pagesperhour) / days;
        System.out.println(hours);

    }
}
