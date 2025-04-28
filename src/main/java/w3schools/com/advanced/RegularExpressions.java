package w3schools.com.advanced;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Visit W3Schools");
        boolean matchFound = matcher.find();
        if (matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }

        Pattern pattern1 = Pattern.compile("w3schools", Pattern.LITERAL);
        if (pattern1.matcher("Visit W3Schools").find()) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }

        Pattern pattern2 = Pattern.compile("STRASSE", Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
        if (pattern2.matcher("Straße").find()) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
    }
}
