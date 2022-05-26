import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double productPrice = 0;
        double totalPrice = 0;

        boolean isValid = true;

      //  плод	banana	apple	orange	grapefruit	kiwi	pineapple	grapes
      //  цена	2.50	1.20	0.85	   1.45	    2.70	     5.50	       3.85
      //  Събота и неделя магазинът работи на по-високи цени:
       // плод	banana	apple	orange	grapefruit	kiwi	pineapple	grapes
       // цена	2.70	1.25	0.90	1.60	    3.00	   5.60	       4.20


        if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday")) {
            if (fruit.equals("banana")) {
                productPrice = 2.50;
            } else if (fruit.equals("apple")) {
                productPrice = 1.20;
            } else if (fruit.equals("orange")) {
                productPrice = 0.85;
            } else if (fruit.equals("grapefruit")) {
                productPrice = 1.45;
            } else if (fruit.equals("kiwi")) {
                productPrice = 2.70;
            } else if (fruit.equals("pineapple")) {
                productPrice = 5.50;
            } else if (fruit.equals("grapes")) {
                productPrice = 3.85;
            } else {
              isValid = false;
            }



        }else if (day.equals("Saturday") || day.equals("Sunday")) {
            if (fruit.equals("banana")) {
                productPrice = 2.70;
            } else if (fruit.equals("apple")) {
                productPrice = 1.25;
            } else if (fruit.equals("orange")) {
                productPrice = 0.90;
            } else if (fruit.equals("grapefruit")) {
                productPrice = 1.60;
            } else if (fruit.equals("kiwi")) {
                productPrice = 3.00;
            } else if (fruit.equals("pineapple")) {
                productPrice = 5.60;
            } else if (fruit.equals("grapes")) {
                productPrice = 4.20;
            }else{
                isValid = false;
            }


        }else{
            isValid = false;
        }

         if (isValid ==false) {
             System.out.println("error");
         } else {
             totalPrice = productPrice * quantity;
             System.out.printf("%.2f", totalPrice);
         }

    }
}
