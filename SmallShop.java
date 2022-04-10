import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String town = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double productPrice = 0;

        if (product.equals("coffee")) {
            if (town.equals("Sofia")) {
                productPrice = 0.50;
            } else if (town.equals("Plovdiv")) {
                productPrice = 0.40;
            } else if (town.equals("Varna")) {
                productPrice = 0.45;
            }
        } else if (product.equals("water")) {
            if (town.equals("Sofia")) {
                productPrice = 0.80;
            } else if (town.equals("Plovdiv")) {
                productPrice = 0.70;
            } else if (town.equals("Varna")){
                productPrice = 0.70;
            }


            }else if (product.equals("beer")) {
            if (town.equals("Sofia")) {
                productPrice = 1.20;
            } else if (town.equals("Plovdiv")) {
                productPrice = 1.15;
            } else if (town.equals("Varna")) {
                productPrice = 1.10;
            }


            } else if (product.equals("sweets")) {
            if(town.equals("Sofia")){
                productPrice = 1.45;
            }else if (town.equals("Plovdiv")) {
                productPrice = 1.30;
            } else if (town.equals("Varna")) {
                productPrice = 1.35;
            }

        } else if (product.equals("peanuts")) {
            if (town.equals("Sofia")) {
                productPrice = 1.60;
            }else if (town.equals("Plovdiv")) {
                productPrice = 1.50;
            } else if (town.equals("Varna")) {
                productPrice = 1.55;
            }

        }
        double totalPrice = productPrice * quantity ;
        System.out.println(totalPrice);



        }
    }