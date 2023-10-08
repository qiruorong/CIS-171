import java.io.*;
import java.util.*;

public class FileComparator {
    public static void main (String[] args) throws FileNotFoundException {
        System.out.prinln ("This program will add a series of numbers from a file.");
        System.out.println();
        Scanner console = new Scanner(System.in);
        System.out.print("What is the file name?");
        Stirng name = console.nextLine();
        Scanner input = new Scanner(new File(name));
        System.out.println();

        int count = 0;
           

            
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










import java.io.*;// for file class
import java.util,*
public class FileProcessing {
    public static void main(Sting[] args) {
        File f = new File ("hamlet.txt");
        System.out.println("exist?: " + f.exists());
        System.out.println("can Read?: " + f.canRead());
    }
}


import java.io.*;// for file class
import java.util.*;
public class CountWords2 {
    public static void main (String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("hamlet.txt"));
        int count = 0;
        while (in.hasNext()) { //if file read, goes into while loop
            string word = in.next();
            count++;
        }
        System.out.prinln("Total words = " + count);
        }
    }
}
    

// open & read txt, count #letter in txt
import java.io.*;
import java.util.*;
public class CountWords2 {
    public static void main (String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("hamlet.txt"));
        int count = 0;
        int totalletters = 0;
        while(in.hasNext()) {
            String word = in.mext();
            totalLetters += word.length();
            count++;
        }
        System.out.println("Total words = " + count);
    }
}


// input file name, fine Min&Max
import java.io.*;
import java.util.*;
public class ShowSum4 {
    public static void main (String[] args) throws FileNotFoundException {
        System.out.prinln ("This program will add a series of numbers from a file.");
        System.out.println();
        Scanner console = new Scanner(System.in);
        System.out.print("What is the file name?");
        Stirng name = console.nextLine();
        Scanner input = new Scanner(new File(name));
        System.out.println();

        double sum = 0.0;
        int count = 0;
        double min, max;
        min = max = input.nextDouble();
        while (input.hasNextDouble()) {
            double next = input.nextDouble();
            if(min > next) min = next;
            if(max < next) max = next;
            count++;
            System.out.println("number " + count + " = " + next);
            sum += next;
        }
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }
}



