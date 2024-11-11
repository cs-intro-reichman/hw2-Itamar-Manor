// Computes an approximation of PI.
public class CalcPi {
	public static void main(String[] args) {
		int times = Integer.parseInt(args[0]);
		double aproxPi = 0;
		for (int i = 0; i < times; i++) {
			aproxPi += 1.0 / ((1 + i * 2) * (Math.pow(-1, i % 2)));
		}
		aproxPi *= 4;
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + aproxPi);
	}
}
