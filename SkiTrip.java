import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nights = Integer.parseInt(scanner.nextLine());
        String place = scanner.nextLine();
        String assess = scanner.nextLine();
        double placePrice = 0;

        switch (place) {
            case "room for one person":
                placePrice = (nights-1) * 18;
                break;

        case "apartment":
            if (nights < 10) {
                placePrice = ((nights-1) * 25) * 0.70;
            }else if (nights < 15) {
                placePrice = ((nights-1) * 25) * 0.65;
            }else {
                placePrice = ((nights-1) * 25) * 0.5;
            }
            break;
            case "president apartment" :
                if (nights < 10) {
                    placePrice = ((nights-1) * 35) * 0.90;
                }else if (nights < 15) {
                    placePrice = ((nights-1) * 35) * 0.85;
                }else {
                    placePrice = ((nights-1) * 35) * 0.80;
                }
                break;

        }
        if (assess.equals("positive")) {
            placePrice *= 1.25;
        } else {
            placePrice *= 0.90;
        }

        System.out.printf("%.2f",placePrice);


       //вид помещение	                     по-малко от 10 дни	        между 10 и 15 дни	    повече от 15 дни
        // room for one person	            не ползва намаление	          не ползва намаление 	не ползва намаление
        //apartment	                            30% от крайната цена	35% от крайната цена	    50% от крайната цена
        // president apartment	              10% от крайната цена	       15% от крайната цена	   20% от крайната цена

    }
}