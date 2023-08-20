























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
