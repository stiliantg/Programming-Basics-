import java.util.Scanner;

public class Areacomplex {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String figure = scanner.nextLine();
            double area = 0;

            if (figure.equals("square")) {
                double a = Double.parseDouble(scanner.nextLine());
                 area = a * a;

            }
            if (figure.equals("rectangle")) {
                double a = Double.parseDouble(scanner.nextLine());
                double b = Double.parseDouble(scanner.nextLine());
                 area = a * b ;
            }
            if (figure.equals("circle")) {
                double a = Double.parseDouble(scanner.nextLine());
                 area = Math.PI * a * a ;

            }
            if (figure.equals("triangle")) {
                double h = Double.parseDouble(scanner.nextLine());
                double b = Double.parseDouble(scanner.nextLine());
                 area = h * b / 2;

            }
            System.out.printf("%.3f" , area);
        }
    }

