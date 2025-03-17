import java.util.Random;
public class MathProblems {
 public static int solve(int a, int b) {
  Random random = new Random();
  int result = a + b;
  if (random.nextInt(2) == 0) {
   result *= 2;
  } else {
   result /= 3;
  }
  return result;
 }
}