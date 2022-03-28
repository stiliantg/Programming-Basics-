import java.util.Scanner;

public class Aquarium {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int lenght = Integer.parseInt(scanner.nextLine());
            int width = Integer.parseInt(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            double percent = Double.parseDouble(scanner.nextLine());
            double leterswater = (lenght * width * height / 1000.00) * (1-percent/100);
            System.out.println(leterswater);
    }
}
