package FOR;

import java.util.Scanner;

public class Clock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = 0;
        int minute = 0;
        int seconds =0;

        for (;;){
            if (hour == 24 ) {
                break;
            }
            System.out.printf("%d : %d : %d%n",hour , minute, seconds);
            seconds++;
            if (seconds == 60){
                minute+=1;
                seconds=0;
            }

            if (minute == 60) {
                hour+=1;
                minute =0;
            }
        }
    }
}