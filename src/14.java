import java.util.Random;

public class MathProblems {
    public static int solve(int n) {
        Random rand = new Random();
        int a = rand.nextInt(n);
        int b = rand.nextInt(n);
        return a * b;
    }
}
