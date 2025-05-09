package w3schools.com.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToAFile {
    public static void main(String[] args) {
        try {
            FileWriter myWriter = new FileWriter(Constants.FILES_URL);
            myWriter.write("Files in Java might be tricky, but it is fun enough!");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
