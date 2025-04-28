package w3schools.com.filehandling;

import java.io.File;

public class Files {
    public static void main(String[] args) {
        File myObj = new File(Constants.FILES_URL); // Specify the filename

        System.out.println("read file: " + myObj.canRead());
    }
}
