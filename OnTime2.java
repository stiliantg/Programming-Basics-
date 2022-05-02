import java.util.Scanner;

public class OnTime2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinutes = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMinutes = Integer.parseInt(scanner.nextLine());
        int examTotal = examHour*60 + examMinutes;
        int arrivalTotal = arrivalHour*60 + arrivalMinutes;
        int diff = Math.abs(examTotal - arrivalTotal);
        int hours = diff / 60;
        int minutes = diff % 60;

        if (examTotal > arrivalTotal) {

            if (examTotal - arrivalTotal <=30) {
                System.out.printf("On time%n%d minutes before the start", minutes);
            } if (examTotal - arrivalTotal <60 && examTotal - arrivalTotal > 30) {
                System.out.printf("Early%n%d minutes before the start", minutes);
            }
            else if (diff >=60 && minutes < 10) {
                System.out.printf("Early%n%d:0%d hours before the start", hours, minutes);
            } else if (diff >=60) {
                System.out.printf("Early%n%d:%d hours before the start",hours,minutes);
            }

        }else if (examTotal < arrivalTotal) {
            if (arrivalTotal - examTotal < 60) {
                System.out.printf("Late%n%d minutes after the start", minutes);
            } else if (minutes < 10) {
                System.out.printf("Late%n%d:0%d hours after the start", hours, minutes);
            } else {
                System.out.printf("Late%n%d:%d hours after the start",hours,minutes);
            }

        } else {
            System.out.printf("On time");
        }
    }
}