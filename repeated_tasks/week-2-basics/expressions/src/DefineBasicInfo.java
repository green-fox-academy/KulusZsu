public class DefineBasicInfo {
    public static void main(String[] args) {
        // Define several things as a variable then print their values
        // Your name as a string
        // Your age as an integer
        // Your height in meters as a double
        // Whether you are married or not as a boolean

        String name = "Zsuzska";
        int age = 21;
        double height = 1.62;
        boolean married = false;

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);

        if (married) {
            System.out.println("I'm married.");
        }
        else {
            System.out.println("I'm not married.");
        }
    }
}