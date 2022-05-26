import java.util.Scanner;

public class Food {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chicken = Integer.parseInt(scanner.nextLine());
        int fish = Integer.parseInt(scanner.nextLine());
        int vegetarian = Integer.parseInt(scanner.nextLine());
        double dessert = (chicken * 10.35 + fish * 12.40 + vegetarian * 8.15) * 0.20;
        double bill = (chicken * 10.35 + fish * 12.40 + vegetarian * 8.15) + dessert + 2.50;
        System.out.println(bill);

    }
}
