public class MathProblems {
    public static void main(String[] args) {
        int sum = 0;
        int product = 1;

        // Generate random numbers for demonstration
        double num1 = Math.random() * 100 + 1;
        double num2 = Math.random() * 100 + 1;

        System.out.println("Random Sum: " + (sum += num1));
        System.out.println("Random Product: " + (product *= num2));
    }
}
