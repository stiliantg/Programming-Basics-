import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        double price = 0;
        String destination = "";
        String typeNight = "";

        switch (season) {
            case "summer" :
                typeNight = "Camp";
                if (budget <=100) {
                    price = budget * 0.3;
                    destination = "Bulgaria";
                } else if (budget <=1000) {
                    price = budget * 0.4;
                    destination = "Balkans";
                } else {
                    price = budget * 0.9;
                    destination = "Europe";
                }
                break;

            case "winter" :
                typeNight = "Hotel";
                if (budget <=100) {
                    price = budget * 0.7;
                    destination = "Buglaria";
                } else if (budget <=1000) {
                    price = budget * 0.8;
                    destination = "Balkans";
                } else {
                    price = budget * 0.9;
                    destination = "Europe";
                }
                break;
        }
        System.out.printf("Somewhere in %s%n%s - %.2f", destination , typeNight , price );
    }
}
