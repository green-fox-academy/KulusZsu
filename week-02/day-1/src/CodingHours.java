public class CodingHours {
    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        //
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52
        //
        // 6 hours/day, 17 weeks, 5 day/week
        //
        int myNumber = (5 * 6 * 17);
        System.out.println("An average attendee spend " + myNumber + " hours with coding per semesters.");
        //
        // Avg 52 hours/week
        int avgPcnt = (100 * (52 * 17)/(myNumber)) - 100;
        System.out.println("Average percentage is: " + avgPcnt);
    }
}

