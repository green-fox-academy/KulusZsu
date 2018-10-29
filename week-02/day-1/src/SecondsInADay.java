public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables

        int fullSecaday = 24 * 60 *60;
        int currSecday = (14 * 60 * 60) + (34 * 60) + 42;

        //System.out.println(fullSecaday);
        //System.out.println(currSecday);

        int remSec = fullSecaday - currSecday;
        System.out.println("Remaining Seconds today: " + remSec);
    }
}
