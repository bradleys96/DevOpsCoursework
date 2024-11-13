import java.util.Scanner;

class Dec2Hex {
    public static void main(String args[])

	// Check if an argument was provided
        if (args.length == 0) {
            System.out.println("Error: No input provided. Please enter an integer.");
            return; // Exit program if no input


        int num = Integer.parseInt(args[0]);
        char[] ch = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        String hexadecimal = "";
        System.out.println("Converting the Decimal Value " + num + " to Hex...");

        while (num != 0) {
            int rem = num % 16;
            hexadecimal = ch[rem] + hexadecimal;
            num = num / 16;
        }

        System.out.println("Hexadecimal representation is: " + hexadecimal);
    }
}
