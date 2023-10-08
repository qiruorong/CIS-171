import java.io.*;
import java.util.*;

public class FileComparator {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("This program will compare two files and print the differences.");
        System.out.println();

        Scanner console = new Scanner(System.in);

        System.out.print("Enter the first file name: ");
        String name1 = console.nextLine();
        System.out.print("Enter the second file name: ");
        String name2 = console.nextLine();

        Scanner file1 = new Scanner(new File(name1));
        Scanner file2 = new Scanner(new File(name2));

        System.out.println("Differences found:");

        int lineNumber = 1;

        while (file1.hasNextLine() && file2.hasNextLine()) {
            String line1 = file1.nextLine();
            String line2 = file2.nextLine();

            if (!line1.equals(line2)) {
                System.out.println("Line " + lineNumber + ":");
                System.out.println("< " + line1);
                System.out.println("> " + line2);
            }
            lineNumber++;
        }

        while (file1.hasNextLine()) {
            System.out.println("Line " + lineNumber + ":");
            System.out.println("< " + file1.nextLine());
            lineNumber++;
        }

        while (file2.hasNextLine()) {
            System.out.println("Line " + lineNumber + ":");
            System.out.println("> " + file2.nextLine());
            lineNumber++;
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



