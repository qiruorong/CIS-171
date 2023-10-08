import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileComparator {
    public static void main(String[] args) {
        try (BufferedReader reader1 = new BufferedReader(new FileReader("data1.txt"));
             BufferedReader reader2 = new BufferedReader(new FileReader("data2.txt"))) {

            String line1, line2;
            int lineNum = 0;
            boolean differencesFound = false;

            while ((line1 = reader1.readLine()) != null && (line2 = reader2.readLine()) != null) {
                lineNum++;

                if (!line1.equals(line2)) {
                    differencesFound = true;
                    System.out.println("Difference found:");
                    System.out.println("Line " + lineNum + ":");
                    System.out.println("< " + line1);
                    System.out.println("> " + line2);
                }
            }

            // Check for any remaining lines in either file
            while ((line1 = reader1.readLine()) != null) {
                lineNum++;
                differencesFound = true;
                System.out.println("Difference found:");
                System.out.println("Line " + lineNum + ":");
                System.out.println("< " + line1);
            }

            while ((line2 = reader2.readLine()) != null) {
                lineNum++;
                differencesFound = true;
                System.out.println("Difference found:");
                System.out.println("Line " + lineNum + ":");
                System.out.println("> " + line2);
            }

            if (!differencesFound) {
                System.out.println("No differences found.");
            }

        } catch (IOException e) {
            System.err.println("An error occurred while comparing files: " + e.getMessage());
        }
    }
}
