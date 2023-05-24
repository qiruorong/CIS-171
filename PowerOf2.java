public class PowerOf2 {
    public static void main(String[] args) {
        printPowerOf2(3);
        System.out.println();
        printPowerOf2(10);
    }
    
    public static void printPowerOf2(int maxPower) {
        int power = 0;
        int result = 1;
        
        for (int i = 0; i <= maxPower; i++) {
            System.out.print(result + " ");
            power++;
            result = result * 2;
        }
    }
}
