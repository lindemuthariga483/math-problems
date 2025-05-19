public class MathProblemsSolution {
    public static void main(String[] args) {
        int result = performCalculation(5, 3, 2);
        System.out.println("The result is: " + result);
    }

    private static int performCalculation(int a, int b, int operation) {
        switch (operation) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b != 0) {
                    return a / b;
                } else {
                    throw new IllegalArgumentException("Division by zero is not allowed.");
                }
        }
    }
}
