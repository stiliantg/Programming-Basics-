import java.util.Scanner;

public class Basketball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yeartax = Integer.parseInt(scanner.nextLine());
        double shoes = yeartax - yeartax * 0.4;
        double outfit = shoes - shoes * 0.2;
        double ball = outfit * 1/4;
        double accessoaries = ball * 1/5;
        double alltaxes = yeartax + shoes + outfit + ball + accessoaries;
        System.out.println(alltaxes);

    }
}
