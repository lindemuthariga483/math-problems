import org.javatuples.Pair;

public class MathProblems {
    public static void main(String[] args) {
        // Example problem: Sum of first n natural numbers
        int n = 10;
        System.out.println("Sum of first " + n + " natural numbers is: " + sum(n));

        // Another example: Average of first n even numbers
        int count = 5;
        double average = calculateAverageEvenNumbers(count);
        System.out.println("Average of the first " + count + " even numbers is: " + average);

        // Example problem: Largest prime factor of a number
        int num = 289;
        System.out.println("Largest prime factor of " + num + " is: " + largestPrimeFactor(num));
    }

    private static double sum(int n) {
        return (n * (n + 1)) / 2;
    }

    private static double calculateAverageEvenNumbers(int count) {
        double total = 0;
        for (int i = 2; i <= count; i += 2) {
            total += i;
        }
        return total / count;
    }

    private static int largestPrimeFactor(int num) {
        if (num % 2 == 0) {
            return 2;
        }
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            while (num % i == 0) {
                num /= i;
            }
        }
        return int.MAX_VALUE;
    }
}
