import java.util.*;
public class evenSumMax {
 
public static void main(String[] args) {
Scanner console = new Scanner(System.in);
System.out.print("How many numbers do you have? ");
int totalNumber = console.nextInt();
int evenSum = 0;
int evenMax = Integer.MIN_VALUE;
for (int i = 1; i <= totalNumber; i++) {
System.out.print("Next Integer? ");
int num = console.nextInt();
if (num % 2 == 0) {
  evenSum += num;
 if (num > evenMax) {
   evenMax = num;
}
}
}
console.close(); 
System.out.println();
System.out.print("Even sum = " + evenSum + ", ");
System.out.println("Even max = " + evenMax);
 







NOTES:
public class FirstIf {
  public static void main(String[] args) {
    int n = 10;
    if (n<=5) {
      System.out.prinln ("n is greater than 5");
    } else {
    // else if ( ) {
      System.out.pirntln ("n is not less than 5");
    }
  }
}


left == right (only for int)
if (s.equals("yes"))
if (s.equalsIgnoreCase("yes"))

&& // both true
|| // either one is true


public class DaysInMonth {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Type month(1-12): ");
    int month = in.nextInt();
    daysInMonth(month);
    int days = daysInMonth(month);
    System.out.println("Month" + month " have" + days + "days");
  }
  public static int daysInMonth (int month) {
    if (month == 1 || month == 3 || month ==5 || month == 7 || month ==8 ||month ==10 || month == 12) return 31;
    else if (month == 2) return 28;
    else return 30;
  }
}


chat letter = 'a' + 2 // print c
for (char letter = 'a'; letter <= 'z'; letter += 1) {

