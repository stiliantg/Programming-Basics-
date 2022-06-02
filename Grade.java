package FOR;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int students = Integer.parseInt(scanner.nextLine());
        double totalGrade = 0;
        double grade2 = 0;
        double grade3 = 0;
        double grade4 = 0;
        double grade5 = 0;
        int topstudents =0;
        int fail = 0;

        for (int i = 1 ; i<=students ; i++) {
            double grade = Double.parseDouble(scanner.nextLine());
            totalGrade +=grade;

            if (grade < 3) {
                grade2++;
                fail++;
            } else if (grade < 4 ) {
                grade3++;
            }else if (grade < 5) {
                grade4++;
            }else {
                grade5++;
                topstudents++;
            }
        }
    double average = totalGrade * 1.0/ students;
    double percent2 = (grade2 * 1.0/ students) * 100;
    double percent3 = (grade3 * 1.0/ students) * 100;
    double percent4 = (grade4 * 1.0/ students) * 100;
    double percent5 = (grade5 * 1.0/ students) * 100;
        System.out.printf("Top students: %.2f%%%nBetween 4.00 and 4.99: %.2f%%%nBetween 3.00 and 3.99: %.2f%%%nFail: %.2f%%%nAverage: %.2f",percent5 , percent4 , percent3 , percent2 ,average);
    }
}
