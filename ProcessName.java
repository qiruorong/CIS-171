import java.util.Scanner;

public class ReverseName {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter your full name: ");
        String s = in.nextLine();
        String reversed = reverseString(s);
        System.out.println("Your name in reverse order is " + reversed);
    }

    public static String reverseString(String input) {
        String[] nameParts = input.split(" ");
        String reversed = "";
        
        if (nameParts.length >= 2) {
            reversed = nameParts[1] + " " + nameParts[0];
        }   
        return reversed;
    }
}

