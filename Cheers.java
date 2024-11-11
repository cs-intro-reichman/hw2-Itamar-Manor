// Prints a crowd cheering output.
public class Cheers {
        public static String getPrefix(char c) {
                char[] anLetters = { 'A', 'E', 'F', 'H', 'I', 'L', 'M', 'N', 'O', 'R', 'S', 'X' };
                for (int i = 0; i < anLetters.length; i++) {
                        if (c == anLetters[i]) {
                                return "an";
                        }
                }
                return "a ";
        };

        public static void main(String[] args) {
                String input = args[0].toUpperCase();
                int times = Integer.parseInt(args[1]);

                for (int i = 0; i < input.length(); i++) {
                        char c = input.charAt(i);
                        System.out.printf("Give me %s %c: %c!\n", getPrefix(c), c, c);
                }

                System.out.println("What does that spell?");
                for (int i = 0; i < times; i++) {
                        System.out.println(input + "!!!");
                }
        }
}
