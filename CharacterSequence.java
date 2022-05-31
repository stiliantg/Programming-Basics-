package FOR;

import java.util.Scanner;

public class CharacterSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sequence = scanner.nextLine();
        int length = sequence.length();

        for (int i = 0 ; i<length ; i++) {
            char symbol = sequence.charAt(i);
            System.out.println(symbol);
        }
    }
}
