public class Main {
    public static void main(String[] args) {
        int a = 15;
        int b = 4;

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));   // integer division 
        System.out.println("a % b = " + (a % b));   // modulus (remainder)

        double x = 15.0;
        double y = 4.0;
        System.out.println("x / y = " + (x / y));  

        // Increment/decrement and compound assignment
        int counter = 10;
        counter++;           // post-increment
        System.out.println("After ++: " + counter);

        counter--;
        System.out.println("After --: " + counter);

        counter += 5;         // same as counter = counter + 5
        counter -= 2;
        counter *= 3;
        System.out.println("After compound ops: " + counter);

        // Comparison and logical operators

        int age = 20;
        boolean hasID = true;

        System.out.println("age > 18: " + (age > 18));
        System.out.println("age == 20: " + (age == 20));
        System.out.println("age != 21: " + (age != 21));

        boolean canEnter = (age >= 18) && hasID;   // AND
        boolean canGetDiscount = (age < 12) || (age > 65); // OR
        boolean isNotTeen = !(age >= 13 && age <= 19); // NOT

        System.out.println("canEnter: " + canEnter);
        System.out.println("canGetDiscount: " + canGetDiscount);
        System.out.println("isNotTeen: " + isNotTeen);


    }
}