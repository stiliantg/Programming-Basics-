import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Dogpackage = Integer.parseInt(scanner.nextLine());
        int Catpackage = Integer.parseInt(scanner.nextLine());

        double dogprice = 2.50;
        int catprice = 4;

        double totaldog = Dogpackage * dogprice;
        int totalcat = Catpackage * catprice;

        double totalsum = totaldog + totalcat;
        System.out.println(+totalsum+ " lv.");
    }
}
