package bnv.com.example.javaclasses.dateandtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Dates {
    public static void main(String[] args) {
        LocalDate myObj = LocalDate.now(); // Create a date object
        System.out.println("the current date: " + myObj); // Display the current date

        LocalTime myObj1 = LocalTime.now();
        System.out.println("the current time: " + myObj1);

        LocalDateTime curDateTime = LocalDateTime.now();
        System.out.println("Before formatting: " + curDateTime);

        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = myFormatObj.format(curDateTime);
        System.out.println("After formatting: " + formattedDate);

        String[] formats = {"yyyy-MM-dd", "dd/MM/yyyy", "dd-MMM-yyyy", "E, MMM dd yyyy"};

        for (String i : formats) {
            DateTimeFormatter myFormat = DateTimeFormatter.ofPattern(i);
            String newDate = myFormat.format(curDateTime);
            System.out.println(i + " : " + newDate);
        }
    }
}
