public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables

        int remHours = (24 - currentHours - 1);
        int remMins = (60 - currentMinutes - 1);
        int remSec = (60 - currentSeconds);

        System.out.println("Remaining time: " + remHours + ":" + remMins + ":" + remSec);
    }
}
