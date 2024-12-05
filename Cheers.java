// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String input = args[0].toUpperCase();
                int times = Integer.parseInt(args[1]);
                String anLetters = "AEFHILMNORSX";
                for (int i = 0; i < input.length(); i++) {
                        char c = input.charAt(i);
                        if (anLetters.indexOf(c) == -1) {
                                System.out.println("Give me a  " + c + ": " + c + "!");
                        } else {
                                System.out.println("Give me an " + c + ": " + c + "!");
                        }
                }

                System.out.println("What does that spell?");
                for (int i = 0; i < times; i++) {
                        System.out.println(input + "!!!");
                }
        }
}
