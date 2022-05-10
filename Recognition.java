import java.util.Scanner;

public class Recognition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String surname = scanner.nextLine();
        String town = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("You are " +name+ "" +surname+ " from " + town+  ". And you are "+age+ "-years old");

    }
}
