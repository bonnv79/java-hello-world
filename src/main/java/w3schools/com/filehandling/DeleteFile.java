package w3schools.com.filehandling;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File myObj = new File(Constants.FILES_URL);
        if (myObj.delete()) {
            System.out.println("Deleted the file: " + myObj.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}
