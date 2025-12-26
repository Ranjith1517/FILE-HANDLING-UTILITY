import java.io.*;

/**
 * FileHandlingUtility
 * --------------------
 * This program demonstrates basic file handling operations in Java:
 * 1. Create and write to a text file
 * 2. Read from a text file
 * 3. Append (modify) content in a text file
 *
 * Internship Task - CODTECH
 */

public class FileHandlingUtility {

    // File name
    private static final String FILE_NAME = "sample.txt";

    public static void main(String[] args) {

        // Step 1: Write to file
        writeToFile("Hello, this is my first file handling task.\n");

        // Step 2: Read file
        readFromFile();

        // Step 3: Modify (Append) file
        appendToFile("This line is added later using append operation.\n");

        // Step 4: Read file again after modification
        readFromFile();
    }

    /**
     * Writes content to a file (overwrites existing content)
     */
    public static void writeToFile(String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            writer.write(content);
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file.");
            e.printStackTrace();
        }
    }

    /**
     * Reads content from a file
     */
    public static void readFromFile() {
        System.out.println("\nReading file content:");
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file.");
            e.printStackTrace();
        }
    }

    /**
     * Appends content to an existing file
     */
    public static void appendToFile(String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            writer.write(content);
            System.out.println("\nFile modified (content appended).");
        } catch (IOException e) {
            System.out.println("Error appending to file.");
            e.printStackTrace();
        }
    }
}
