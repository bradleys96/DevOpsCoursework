import java.util.Scanner;

// This is a test comment
// Test number 2
//This is for the video 2


class Dec2Hex {
    public static int Arg1;

    public static void main(String args[]) {
        // Check if an argument was provided
        if (args.length == 0) {
            System.out.println("Error: No input provided. Please enter an integer.");
            return; // Exit program if no input
        }

        try {
            // Try to parse the argument as an integer
            int num = Integer.parseInt(args[0]);
            char[] ch = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
            String hexadecimal = "";
            System.out.println("Converting the Decimal Value " + num + " to Hex...");

            // Convert decimal to hexadecimal
            while (num != 0) {
                int rem = num % 16;
                hexadecimal = ch[rem] + hexadecimal;
                num = num / 16;
            }

            System.out.println("Hexadecimal representation is: " + hexadecimal);

        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input. Please enter a valid integer.");
        }
    }
}

