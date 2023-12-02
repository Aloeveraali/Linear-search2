import java.util.Scanner;

public class LinearSearch2 {

    // Method to count occurrences of a string in a 2D array of strings
    public static int countStrings(String[][] array, String target) {
        int count = 0;
        for (String[] row : array) {
            for (String element : row) {
                if (element.equalsIgnoreCase(target)) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // Sample 2D array of strings (Do not change this code)
        String[][] sampleArray1 = {
                {"cat", "dog", "aUcK"},
                {"dUcK", "DucK", "goose"}
        };

        // User input for the string to search
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string to search for: ");
        String searchString = scanner.nextLine();

        // Check the number of occurrences of the string in the array
        int occurrences = countStrings(sampleArray1, searchString);

        // Print the result
        System.out.println(searchString + " is contained " + occurrences + " times in the array");

        // Close the scanner
        scanner.close();
    }
}
