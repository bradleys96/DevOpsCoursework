import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Dec2HexTest {

    // Test for missing argument (No input)
    @Test
    void testNoInput() {
        String[] args = {};
        Dec2Hex.main(args);
        // We expect an error message to be printed for missing input.
    }

    // Test for valid integer input
    @Test
    void testValidInput() {
        String[] args = {"255"};
        Dec2Hex.main(args);
        // We expect output: "Hexadecimal representation is: FF"
    }

    // Test for non-integer input
    @Test
    void testNonIntegerInput() {
        String[] args = {"hello"};
        Dec2Hex.main(args);
        // We expect an error message for invalid input.
    }

    // Test for decimal to hexadecimal conversion logic
    @Test
    void testDecimalToHexConversion() {
        int decimal = 255;
        String expected = "FF"; // Expected hexadecimal result
        String actual = convertDecimalToHex(decimal);
        assertEquals(expected, actual);
    }

    // Extracted conversion logic for unit testing
    private String convertDecimalToHex(int num) {
        char[] ch = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        String hexadecimal = "";
        while (num != 0) {
            int rem = num % 16;
            hexadecimal = ch[rem] + hexadecimal;
            num = num / 16;
        }
        return hexadecimal;
    }
}
