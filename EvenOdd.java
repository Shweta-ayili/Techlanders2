import java.util.Scanner; // Import Scanner for user input

public class BasicJavaExample {

    // Function to check if a number is even or odd
    public static String checkEvenOdd(int number) {
        if (number % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Display a welcome message
        System.out.println("Welcome to the Basic Java Program!");

        // Input: Ask the user for their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Greet the user
        System.out.println("Hello, " + name + "!");

        // Input: Ask the user for a number
        System.out.print("Enter a number: ");
        while (!scanner.hasNextInt()) { // Validate input
            System.out.println("Invalid input. Please enter an integer.");
            scanner.next(); // Clear invalid input
        }
        int number = scanner.nextInt();

        // Process: Check if the number is even or odd
        String result = checkEvenOdd(number);

        // Output: Display the result
        System.out.println("The number " + number + " is " + result + ".");

        // Example of a loop: Print numbers from 1 to 5
        System.out.println("Here are numbers from 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // Close the scanner to prevent resource leaks
        scanner.close();

        // Goodbye message
        System.out.println("Thank you!");
    }
}
