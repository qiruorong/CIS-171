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





NOTES:
Public class Figure2 {
  public static void main(String[] args) {
    drawX;
    drawDiamond;
  }
  public static void drawDiamond() {
    System.out.printLn("    /\\  ");
    System.out.printLn("   /  \\ ");
    System.out.printLn("   \\  / ");
    System.out.printLn("    \\/  ");
  }
  Public static vois drawX() {
    System.out.printLn("   \\  / ");
    System.out.printLn("    \\/  ");
    System.out.printLn("     /\\ ");
    System.out.printLn("    /  \\ ");
  }
}

/// int, double, char, boolean(True/False)
System.out.println(5/3); // 1
System.out.println(5.0/3); // 1.666667
System.out.println(5%3); //2 (modulo operator return reminder)
System.out.println(4%10); //4 (the original num)
