import java.util.Random;
public class RandomNumber {
	public static void main(String[] args) {
		int lowerBound = 10;
		int upperBound = 20;
		Random rn = new Random();
		int randomNum = rn.nextInt(upperBound - lowerBound + 1) + lowerBound;
		System.out.println("The random number is: " + randomNum);
	}
}