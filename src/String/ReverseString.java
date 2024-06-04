package String;
public class ReverseString {
    public static void main(String[] args) {
        // Input string
        String input = "Selenium";

        // Convert the string to a character array
        char[] charArray = input.toCharArray();

        // Initialize an empty string to store the reversed string
        String reversedString = "";

        // Iterate through the character array in reverse order and build the reversed string
        for (int i = charArray.length - 1; i >= 0; i--) {
            reversedString += charArray[i];
        }

        // Print the reversed string
        System.out.println("Input: " + input);
        System.out.println("Output: " + reversedString);
    }
}
