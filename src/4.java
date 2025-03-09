import java.util.Random;

public class MathProblems {
    public static int getNextRandomNumber(int lowerBound, int upperBound) {
        Random random = new Random();
        return random.nextInt((upperBound - lowerBound) + 1) + lowerBound;
    }
}