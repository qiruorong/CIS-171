public class PatternGenerator {
    public static void main(String[] args) {
        printPattern1();
        System.out.println();
        printPattern2();
        System.out.println();
        printPattern3();
    }

    public static void printPattern1() {
        printLine();
        printLine();
        printMiddleLine();
        printVerticalSpaces();
        printMiddleLine();
    }

    public static void printPattern2() {
        printLine();
        printLine();
        printMiddleLine();
        printVerticalSpaces();
        printMiddleLine();
        printLine();
        printLine();
    }
    
    public static void printPattern3() {
        printVerticalSpaces();
        printVerticalSpaces();
        printLine();
        printLine();
        printMiddleLine();
        printVerticalSpaces();
        printMiddleLine();
    }
    
    public static void printLine() {
        System.out.println("*****");
    }

    public static void printMiddleLine() {
        System.out.println("  * *");
    }

    public static void printVerticalSpaces() {
        System.out.println("    *");
    }
}
