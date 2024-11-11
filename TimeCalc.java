public class TimeCalc {
    public static void main(String[] args) {
        int hours = Integer.parseInt(args[0].substring(0, 2));
        int minutes = Integer.parseInt(args[0].substring(3, 5));
        int minutesToAdd = Integer.parseInt(args[1]);

        hours = (hours + (minutes + minutesToAdd) / 60) % 24;
        minutes = (minutes + minutesToAdd) % 60;

        System.out.printf("%02d:%02d", hours, minutes);
    }
}
