import java.util.Scanner;

public class Time15min {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int allminutes = hour * 60 + minutes + 15;
        int newhour = allminutes / 60;
        int newminutes = allminutes % 60;

        if (newhour > 23) {
            newhour = 0;
        }

        if (newminutes < 10) {
            System.out.printf("%d:0%d",newhour ,newminutes);
        }else{
            System.out.printf("%d:%d",newhour ,newminutes);
        }
    }
}
