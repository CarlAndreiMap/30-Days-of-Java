public class Main {
    public static void main(String[] args) {
        // Integer types
        byte smallNumber = 100;
        short mediumNumber = 20000;
        int regularNumber = 100000;
        long bigNumber = 10000000000L; // note the L suffix

        // Floating point types
        float decimalSmall = 3.14f; // note the f suffix
        double decimalBig = 3.14159265359;

        // Character and boolean
        char letter = 'J';
        boolean isLearning = true;

        // Print them all out
        System.out.println("byte: " + smallNumber);
        System.out.println("short: " + mediumNumber);
        System.out.println("int: " + regularNumber);
        System.out.println("long: " + bigNumber);
        System.out.println("float: " + decimalSmall);
        System.out.println("double: " + decimalBig);
        System.out.println("char: " + letter);
        System.out.println("boolean: " + isLearning);
    }
}