import java.util.*;

public class MathProblems {
    public static void main(String[] args) {
        // Example of finding the greatest common divisor (GCD)
        int num1 = 48;
        int num2 = 36;
        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + findGCD(num1, num2));

        // Example of sorting a list in ascending order
        List<Integer> numbers = Arrays.asList(5, 3, 8, 7, 2);
        Collections.sort(numbers);
        System.out.println("Sorted list in ascending order: " + numbers);

        // Example of finding the square root of a number
        double numberToFind = 16.0;
        double sqrtValue = Math.sqrt(numberToFind);
        System.out.println("The square root of " + numberToFind + " is: " + sqrtValue);
    }

    // A simple method to find the greatest common divisor (GCD)
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
