import java.util.Random;

public class MathProblems {
    public static void main(String[] args) {
        Random rand = new Random();
        int num1 = rand.nextInt(10);
        int num2 = rand.nextInt(10);
        System.out.println(num1 + "+" + num2);
    }
}