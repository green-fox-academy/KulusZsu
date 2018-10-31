public class Unique {
    public static void main(String[] args) {
        //  Create a function that takes a list of numbers as a parameter
        //  Returns a list of numbers where every number in the list occurs only once

        //  Example
        System.out.println(unique(new int[]{1, 11, 34, 11, 52, 61, 1, 34}));
        //  should print: `[1, 11, 34, 52, 61]`

        //it was a practice in the class but is hadn't finished...

        public static int[] unique ( int[] numbers){
            int[] result;
            int countOfNotUniques = 0;


            for (int i = 0; 1 < numbers.length; i++) {
                boolean isUnique = true;

                for (int j = 0; j < numbers.length; j++) {
                    if (numbers[i] == numbers[j] && i != j) {
                        isUnique = false;
                    }
                }
            }
            return result;
        }
    }
