import java.util.Scanner;
import java.util.Random;

public class diceSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String prompt = "Desired dice sum: ";
        diceSum(in, prompt);
    }

    public static void diceSum(Scanner in, String prompt) {
        System.out.print(prompt);
        int desiredSum = in.nextInt();
        Random r = new Random();
        int sum = 0;

        do {
            int roll1 = r.nextInt(6) + 1;
            int roll2 = r.nextInt(6) + 1;
            sum = roll1 + roll2;
            System.out.println(roll1 + " and " + roll2 + " = " + sum);
        } while (sum != desiredSum);
    }
}



public class diceSum {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Desired dice sum: ");
    int desiredSum = scanner.nextInt();
    Random r = new Random();
    int count = 0;
    int roll1, roll2;
    do {
      roll1 = r.nextInt(6) + 1;
      roll2 = r.nextInt(6) + 1;
      System.out.println(die1 + " and " + die2 + " = " + sum);
    } while (sum != desiredSum);
    break;
  }
}



// roll two dice until get two same
public class doubles {
  public static void main(String[] args) {
    Random r = new Random();
    int count = 0;
    int roll1, roll2;
    do {
      roll1 = r.nextInt(6) + 1;
      roll2 = r.nextInt(6) + 1;
      System.out.println ("next roll = " + roll1 + ", " + rolls);
      count++;
    } while (roll1 != roll2);
    System.out.println("Doubles after " + count + ", " + rolls);
  }
}

// the for loop go on forever
for( ; ; ) {

      
