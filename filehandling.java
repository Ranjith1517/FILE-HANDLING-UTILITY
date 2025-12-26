import java.io.*;


public class FileHandlingUtility {

    private static final String FILE_NAME = "sample.txt";

    public static void main(String[] args) {

 
        writeToFile("Hello, this is my first file handling task.\n");

        
        readFromFile();

        appendToFile("This line is added later using append operation.\n");


        readFromFile();
    }

    
    public static void writeToFile(String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            writer.write(content);
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file.");
            e.printStackTrace();
        }
    }

  
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
