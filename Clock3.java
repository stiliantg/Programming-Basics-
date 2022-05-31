package FOR;

public class Clock3 {
    public static void main(String[] args) {
        for (int hours = 0; hours <24 ; hours++){
            for (int minutes = 0 ; minutes <=59 ; minutes++){
                System.out.printf("%d:%d%n",hours , minutes);
            }
        }
    }
}
