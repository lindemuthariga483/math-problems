import java.util.Random;

public class MathProblems {
    public static int getRandomNumber() {
        Random rand = new Random();
        return rand.nextInt(10);
    }
}