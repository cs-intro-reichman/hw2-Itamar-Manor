// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int upperBound = Integer.parseInt(args[0]);
		String mode = args[1];

		for (int i = 1; i <= upperBound; i++) {
			int num = i;
			int count = 1;
			do {
				count++;
				if (mode.equals("v")) {
					System.out.print(num + " ");
				}
				if (num % 2 == 0) {
					num /= 2;
				} else {
					num = 3 * num + 1;
				}
			} while (num != 1);
			if (mode.equals("v")) {
				System.out.printf("1 (%d)\n", count);
			}
		}
		System.out.printf("Every one of the first %d hailstone sequences reached 1.", upperBound);
	}
}
