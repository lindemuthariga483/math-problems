public class MathProblemsSolver {
    public static void main(String[] args) {
        // Example problem 1: Sum of first n natural numbers
        int sum = calculateSum(5);
        System.out.println("The sum of first 5 natural numbers is: " + sum);

        // Example problem 2: Calculate factorial of a number
        int fact = calculateFactorial(3);
        System.out.println("The factorial of 3 is: " + fact);

        // Example problem 3: Find the nth Fibonacci number
        int fibNum = findFibonacci(8);
        System.out.println("The 8th Fibonacci number is: " + fibNum);

        // Example problem 4: Compare two numbers
        double firstNumber = 10.5;
        double secondNumber = 20.7;
        if (firstNumber > secondNumber) {
            System.out.println(firstNumber + " is greater than " + secondNumber);
        } else {
            System.out.println(secondNumber + " is greater than " + firstNumber);
        }
    }

    private static int calculateSum(int n) {
        return (n * (n + 1)) / 2;
    }

    private static int calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }

    private static double findFibonacci(int n) {
        if (n <= 2) {
            return 1;
        }
        int a = 0, b = 1;
        for (int i = 2; i < n; i++) {
            int next = a + b;
            a = b;
            b = next;
        }
        return b;
    }
}
