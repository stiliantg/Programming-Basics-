import java.util.Scanner;

public class Hotelroom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());
        double studio = 0;
        double apartament = 0;

        switch (month) {
            case "May":
            case "October":
                studio = 50;
                apartament = 65;
                if (nights >7 && nights < 14) {
                    studio = studio * 0.95;
                }else if (nights > 14) {
                    studio = studio * 0.7;
                    apartament = apartament * 0.9;
            }
                    break;
                    case "June":
                    case "September":
                        studio = 75.20;
                        apartament = 68.70;
                        if (nights > 14) {
                            studio = studio * 0.8;
                            apartament = apartament * 0.9;
                        }
                        break;
                    case "July":
                    case "August":
                        studio = 76;
                        apartament = 77;
                        if (nights > 14) {
                            apartament = apartament * 0.9;
                        }
                        break;
                }
                double studioPrice = nights * studio;
        double apartamentPrice = nights * apartament;

        System.out.printf("Apartment: %.2f lv.%n" , apartamentPrice);
        System.out.printf("Studio: %.2f lv.", studioPrice);
        }
    }

