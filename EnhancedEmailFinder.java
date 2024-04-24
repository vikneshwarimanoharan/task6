package task6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;

public class EnhancedEmailFinder {
    public static void main(String[] args) {
        String text = "Please contact us at info@my-site.com, support123@test.co.uk, or feedback@company-name.org. Invalid emails like @missingusername.com and username@.com shouldn't be detected.";

        // Improved regex pattern to better handle email addresses
        String emailRegex = "\\b[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,7}\\b";

        // Compile the regex pattern
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(text);

        // List to store found email addresses
        List<String> emails = new ArrayList<>();

        // Find and collect all matching email addresses
        System.out.println("Found emails:");
        while (matcher.find()) {
            String foundEmail = matcher.group();
            emails.add(foundEmail);
            System.out.println(foundEmail);
        }

        // Optional: Handling when no emails are found
        if (emails.isEmpty()) {
            System.out.println("No valid emails were found in the text.");
        }
    }
}

