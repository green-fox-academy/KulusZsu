public class Reverse {

    /*
    this is the method part within the charAT,
    for loop starts to check from the end of the above mentioned sentence all the charachters
    */
    public static String reverse(String str) {
        String reversed = "";
        int length = str.length();

        for (int i = length - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }
        return reversed;
    }

    public static void main(String... args){
        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        // Create a method that can reverse a String, which is passed as the parameter
        // Use it on this reversed string to check it!
        // Try to solve this using charAt() first, and optionally anything else after.

        System.out.println(reverse(reversed));
    }
}