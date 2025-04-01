public class MathProblemSolver {
    public static int solveMathProblem(String mathProblem) {
        // Your solution goes here
        // This is just an example of how you might solve a math problem
        if (mathProblem.contains("1 + 2") || mathProblem.contains("3 * 4")) {
            return 7;
        } else {
            return -1; // or some other arbitrary value to indicate the problem was not solved
        }
    }

    public static void main(String[] args) {
        int result = solveMathProblem("1 + 2");
        System.out.println(result);
    }
}
