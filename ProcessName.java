import java.util.Scanner;

public class ReverseName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        processName(scanner);
        scanner.close();
    }
    
    public static void processName(Scanner scanner) {
        System.out.print("Please enter your full name: ");
        String fullName = scanner.nextLine();
        
        String[] names = fullName.split(" ");
        
        if (names.length >= 2) {
            String firstName = names[0];
            String lastName = names[names.length - 1];
            System.out.println("Your name in reverse order is " + lastName + ", " + firstName);
        } else {
            System.out.println("Invalid name entered.");
        }
    }
}
