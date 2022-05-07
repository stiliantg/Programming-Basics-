import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        double s = Double.parseDouble(scanner.nextLine());
        double percent = 0;
        boolean isValid = true;
        double commision = 0;

        //Град	    0 ≤ s ≤ 500	    500 < s ≤ 1 000	      1 000 < s ≤ 10 000	 s > 10 000
        //Sofia	          5%	            7%	               8%	           12%
        //  Varna	      4.5%	         7.5%	                  10%	       13%
        // Plovdiv	   5.5%	            8%	                      12%	          14.5%


        switch (city) {
            case "Sofia":
                if (s >= 0 && s <= 500) {
                    percent = 0.05;
                } else if (s > 500 && s <= 1000) {
                    percent = 0.07;
                } else if (s > 1000 && s <= 10000) {
                    percent = 0.08;
                } else if (s > 10000) {
                    percent = 0.12;
                } else {
                    isValid = false;
                }
                break;
            case "Varna":
                if (s >= 0 && s <= 500) {
                    percent = 0.045;
                } else if (s > 500 && s <= 1000) {
                    percent = 0.075;
                } else if (s > 1000 && s <= 10000) {
                    percent = 0.10;
                } else if (s > 10000) {
                    percent = 0.13;
                } else {
                    isValid = false;
                }
                break;
            case "Plovdiv":
                if (s >= 0 && s <= 500) {
                    percent = 0.055;
                } else if (s > 500 && s <= 1000) {
                    percent = 0.08;
                } else if (s > 1000 && s <= 10000) {
                    percent = 0.12;
                } else if (s > 10000) {
                    percent = 0.145;
                } else {
                    isValid = false;
                }
                break;
            default:
                isValid = false;
                break;



        }
        commision = s * percent;

        if (isValid ==false) {
            System.out.println("error");
        }else {
            System.out.printf("%.2f", commision);
        }
    }
}