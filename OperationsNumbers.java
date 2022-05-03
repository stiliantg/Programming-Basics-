import java.util.Scanner;

public class OperationsNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N1 = Integer.parseInt(scanner.nextLine());
        int N2 = Integer.parseInt(scanner.nextLine());
        double result = 0;
        String operator = scanner.nextLine();
        boolean IsEven = true;

        if (operator.equals("+")) {
            result = N1 + N2;
        } else if (operator.equals("-")) {
            result = N1  - N2;
        } else if (operator.equals("/")){
            result = N1 * 1.00 / N2;
        } else if (operator.equals("*")) {
            result = N1 * N2;
        }else if (operator.equals("%")) {
            result = N1*1.00 % N2;
        }

        if (operator.equals("+") || operator.equals("-") || operator.equals("*")) {
            if (result % 2 !=0) {
                IsEven = false;
            } if (IsEven == false) {
                System.out.printf("%d %s %d = %.0f - odd" , N1 , operator , N2 , result);
            } else {
                System.out.printf("%d %s %d = %.0f - even" , N1 , operator , N2 , result);
            }
        } else if (operator.equals("/") && N2 ==0){
            System.out.printf("Cannot divide %d by zero", N1);
        } else if (operator.equals("%") && N2 == 0) {
            System.out.printf("Cannot divide %d by zero", N1);
        }

        else if (operator.equals("%")) {
            System.out.printf("%d %s %d = %.0f" , N1 , operator , N2, result);
        } else if (operator.equals("/")) {
            System.out.printf("%d / %d = %.2f", N1 , N2 , result);
        }
    }
}
