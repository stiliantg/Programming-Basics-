import java.util.Scanner;

public class OnTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinutes = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMinutes = Integer.parseInt(scanner.nextLine());
        int hourdiff = 0;
        hourdiff = examHour - arrivalHour;
        hourdiff = Math.abs(hourdiff);
        int minutesdiff = 0;
        minutesdiff = examMinutes - arrivalMinutes;
        minutesdiff = Math.abs(minutesdiff);

        if (examHour > arrivalHour && examMinutes == arrivalMinutes) {
            System.out.printf("Early%n%d:00 hours before the start", hourdiff);

        } else if (examHour < arrivalHour && examMinutes == arrivalMinutes) {
            System.out.printf("Late%n%d:00 hours after the start", hourdiff);

        } else if ((examHour > arrivalHour) && (arrivalMinutes > examMinutes || arrivalMinutes < examMinutes)) {
            if (examHour - arrivalHour == 1) {
                minutesdiff = 60 - arrivalMinutes;
                if (minutesdiff < 10) {
                    System.out.printf("On time%n%d minutes before the start",  minutesdiff);
                } else {

                    System.out.printf("On time%n%d minutes before the start", minutesdiff);
                }
            } else if (minutesdiff < 10) {
                System.out.printf("Early%n%d:0%d hours before the start", hourdiff, minutesdiff);
            } else {

                System.out.printf("Early%n%d:%d hours before the start", hourdiff, minutesdiff);
            }

        } else if ((examHour < arrivalHour) && (arrivalMinutes > examMinutes || arrivalMinutes < examMinutes)) {
            if (hourdiff == 1) {
                minutesdiff = 60 - (examMinutes - arrivalMinutes);
                if (minutesdiff < 10) {
                    System.out.printf("Late%n0%d minutes after the start" , minutesdiff);

                }else {
                    System.out.printf("Late%n%d minutes after the start" , minutesdiff);
                }
            }

            if (minutesdiff < 10) {
                System.out.printf("Late%n%d:0%d hours after the start", hourdiff , minutesdiff);

            }else {
                System.out.printf("Late%n%d:%d hours after the start", hourdiff , minutesdiff);
            }
        }else if ((examHour == arrivalHour) && examMinutes < arrivalMinutes) {
                if (minutesdiff < 10) {
                    System.out.printf("Late%n%0d minutes after the start", minutesdiff);
                } else {
                    System.out.printf("Late%n%d minutes after the start", minutesdiff);
                }

            } else if ((examHour == arrivalHour) && examMinutes > arrivalMinutes) {
                if (minutesdiff < 10) {
                    System.out.printf("Early%n%0d minutes before the start", minutesdiff);
                } else {
                    System.out.printf("Early%n%d minutes before the start", minutesdiff);
                }
            } else if (examHour == arrivalHour && examMinutes == arrivalMinutes) {
                System.out.printf("On time");

            }
        }
    }
