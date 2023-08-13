METHOD 1: // return value n, can input 0
public class PowerOf2 {
    public static void main(String[] args) {
        int n = printPowersOf2(3);
    }
    public static int printPowersOf2(int n) {
        for (int i = 0; i <= n; i++) {
            int result = (int) Math.pow(2, i); //cast double to int
            System.out.print(result + " ");
        }
        return n;
    }
}


METHOD 2: // no return, cannot input 0
public class PowerOf2 {
    public static void main(String[] args) {
        printPowersOf2(3);
    }
    public static void printPowersOf2(int n) {
        for (int i = 0; i <= n; i++) {
            int result = (int) Math.pow(2, i); //cast double to int
            System.out.print(result + " ");
        }
    }
}
