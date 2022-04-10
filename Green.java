import java.util.Scanner;

public class Green {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double meters = Double.parseDouble(scanner.nextLine());
        double price = meters * 7.61;
        double discount = price * 0.18;
        double total = price - discount;
        System.out.println("The final price is: "+total+" lv.");
        System.out.println("The discount is "+discount+" lv.");
    }
}
