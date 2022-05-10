import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int razr = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());
        double materialsoutcome = nylon * 1.50 + paint * 14.50 + razr * 5;
        double alloutcome = materialsoutcome +  3  + (paint * 14.50) * 0.10 + 0.40 + hours * ((materialsoutcome +  3  + (paint * 14.50) * 0.10 + 0.40) * 0.30);
        System.out.println(alloutcome);

    }
}
