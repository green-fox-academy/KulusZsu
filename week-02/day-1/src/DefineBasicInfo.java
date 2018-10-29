public class DefineBasicInfo {
    public static void main(String[] args) {
        // Define several things as a variable then print their values
        // Your name as a string
        // Your age as an integer
        // Your height in meters as a double
        // Whether you are married or not as a boolean

        String name = "Zsuzsanna Kulus";
        System.out.println(name);

        int age = 41;
        System.out.println("My age is just a number: " + age + " years");
        double heightInM = 1.62;
        System.out.println("My body height is: " + heightInM + " in meter.");

        boolean a = false;
        if (a) {
            System.out.println("I'm married.");
        } else {
            System.out.println(("I'm not married."));
        }
    }
}
