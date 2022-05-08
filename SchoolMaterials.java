import java.util.Scanner;

public class SchoolMaterials {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pens = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        int detergen = Integer.parseInt(scanner.nextLine());
        double percent = Integer.parseInt(scanner.nextLine());
        double discount = (percent / 100);
        double price = pens * 5.80 + markers * 7.20 + detergen * 1.20 ;
        double fullprice = price - price * discount;
        System.out.println(fullprice);
    }
}

