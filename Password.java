import java.sql.SQLOutput;
import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        String fraze = "s3cr3t!P@ssw0rd";
        if (password.equals(fraze)) {
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong password!");
        }
    }
}
