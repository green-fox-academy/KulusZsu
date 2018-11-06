public class TakesLonger {
    public static void main(String... args){
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        // When saving this quote a disk error has occured. Please fix it.
        // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
        // Using pieces of the quote variable (instead of just redefining the string)

        /* original: Hofstadter's Law: It always takes longer than you expect,
        even when you take into account Hofstadter's Law.
         */

        String missingpart = " always takes longer than ";

        StringBuilder extra = new StringBuilder(quote);
        extra.insert(21, missingpart);
        quote = extra.toString();

        /* another solution
        String extra = new StringBuffer(quote).insert(21, " always takes longer than ").toString();
        quote = extra;
        */

        System.out.println(quote);
    }
}